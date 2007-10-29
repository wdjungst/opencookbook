package org.ocobo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

/**
 * Unit of measure.
 */
@Entity
@XmlType
public class Unit {

	private long id;

	@Id
	@XmlAttribute
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Unit() {
		super();
	}

	public Unit(String name) {
		setName(new Text(name));
	}

	/**
	 * Name.
	 */
	private Text name;

	/**
	 * Description.
	 */
	private Text description;

	/**
	 * Returns name.
	 * 
	 * @return name.
	 */
	@ManyToOne
	public Text getName() {
		return name;
	}

	/**
	 * Sets name.
	 * 
	 * @param name
	 *            name.
	 */
	public void setName(Text name) {
		this.name = name;
	}

	/**
	 * Returns description.
	 * 
	 * @return Description.
	 */
	@ManyToOne
	public Text getDescription() {
		return description;
	}

	/**
	 * Sets description.
	 * 
	 * @param description
	 *            description.
	 */
	public void setDescription(Text description) {
		this.description = description;
	}
}