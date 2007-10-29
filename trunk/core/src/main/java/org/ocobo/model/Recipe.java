package org.ocobo.model;

import java.util.Collection;
import java.util.LinkedList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Describes the recipe.
 */
@Entity
@Table(name = "recipe")
@XmlRootElement(name="recipe")
@XmlType(propOrder = { "name", "aliases", "type", "description", "components",
		"utensils", "vessel" })
public class Recipe {

	private int id = -1;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@XmlAttribute
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	private Text name;

	private Collection<Text> aliases;

	private RecipeType type;

	private Collection<RecipeComponent> components;

	private Text description;

	private Collection<Utensil> utensils;

	private Vessel vessel;

	@ManyToOne
	public Text getName() {
		return name;
	}

	public void setName(Text name) {
		this.name = name;
	}

	@ManyToMany
	public Collection<Text> getAliases() {
		if (aliases == null) {
			aliases = new LinkedList<Text>();
		}
		return aliases;
	}

	public void setAliases(Collection<Text> aliases) {
		this.aliases = aliases;
	}

	@ManyToOne
	public RecipeType getType() {
		return type;
	}

	public void setType(RecipeType type) {
		this.type = type;
	}

	@OneToMany
	public Collection<RecipeComponent> getComponents() {
		if (components == null) {
			components = new LinkedList<RecipeComponent>();
		}
		return components;
	}

	public void setComponents(Collection<RecipeComponent> components) {
		this.components = components;
	}

	@ManyToOne
	public Text getDescription() {
		return description;
	}

	public void setDescription(Text description) {
		this.description = description;
	}

	@ManyToMany
	public Collection<Utensil> getUtensils() {
		if (utensils == null) {
			utensils = new LinkedList<Utensil>();
		}
		return utensils;
	}

	public void setUtensils(Collection<Utensil> utensils) {
		this.utensils = utensils;
	}

	@ManyToOne
	public Vessel getVessel() {
		return vessel;
	}

	public void setVessel(Vessel vessel) {
		this.vessel = vessel;
	}
}