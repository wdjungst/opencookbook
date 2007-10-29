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