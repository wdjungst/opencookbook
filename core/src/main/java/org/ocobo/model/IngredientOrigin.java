package org.ocobo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

/**
 * Origin of the ingredient.
 */
@Entity
@XmlType
public class IngredientOrigin {
	
	public IngredientOrigin() {

	}

	public IngredientOrigin(String name) {
		setName(new Text(name));

	}

	public IngredientOrigin(String name, String description) {
		setName(new Text(name));
		setDescription(new Text(description));
	}

	
	private long id;
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @XmlAttribute
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}

	private Text name;

	private Text description;

	@ManyToOne
	public Text getName() {
		return name;
	}

	public void setName(Text name) {
		this.name = name;
	}

	@ManyToOne
	public Text getDescription() {
		return description;
	}

	public void setDescription(Text description) {
		this.description = description;
	}
}