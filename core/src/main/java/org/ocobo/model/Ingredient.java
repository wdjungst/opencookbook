package org.ocobo.model;

import java.util.Collection;
import java.util.LinkedList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Describes the ingredient.
 */
@Entity
@Table(name = "ingredient")
@XmlType(propOrder = { "name", "aliases", "type", "description", "flavors",
		"origin", "availability" })
@XmlRootElement(name = "ingredient")
public class Ingredient {

	private long id;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@XmlAttribute
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	private Text name;

	private Collection<Text> aliases;

	private IngredientType type;

	private Text description;

	private Collection<IngredientFlavor> flavors;

	private IngredientOrigin origin;

	private Text availability;

	@ManyToOne
	public Text getName() {
		return name;
	}

	public void setName(Text name) {
		this.name = name;
	}

	@ManyToMany
	@XmlElementWrapper(name="aliases")
	@XmlElement(name="alias")
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
	public IngredientType getType() {
		return type;
	}

	public void setType(IngredientType type) {
		this.type = type;
	}

	@ManyToOne
	public Text getDescription() {
		return description;
	}

	public void setDescription(Text description) {
		this.description = description;
	}

	@ManyToMany
	@XmlElementWrapper(name="flavors")
	@XmlElement(name="flavor")
	public Collection<IngredientFlavor> getFlavors() {
		if (flavors == null) {
			flavors = new LinkedList<IngredientFlavor>();
		}
		return flavors;
	}

	public void setFlavors(Collection<IngredientFlavor> flavors) {
		this.flavors = flavors;
	}

	@ManyToOne
	public IngredientOrigin getOrigin() {
		return origin;
	}

	public void setOrigin(IngredientOrigin origin) {
		this.origin = origin;
	}

	@ManyToOne
	public Text getAvailability() {
		return availability;
	}

	public void setAvailability(Text availability) {
		this.availability = availability;
	}
}
