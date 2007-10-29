package org.ocobo.model;

import java.math.BigDecimal;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Describes the measue. Consists of amount and unit.
 */
@Entity
@XmlType
@XmlRootElement(name="measure")
public class Measure {

	public Measure() {
	}

	public Measure(BigDecimal amount, Unit unit) {
		setAmount(new Amount(amount));
		setUnit(unit);
	}

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

	/**
	 * Amount.
	 */
	private Amount amount;

	/**
	 * Unit.
	 */
	private Unit unit;

	/**
	 * Returns the amount.
	 * 
	 * @return amount.
	 */
	@Embedded
	@AttributeOverrides( { @AttributeOverride(name = "value", column = @Column(name = "AMOUNT")) })
	public Amount getAmount() {
		return amount;
	}

	/**
	 * Sets the amount.
	 * 
	 * @param amount
	 *            amount.
	 */
	public void setAmount(Amount amount) {
		this.amount = amount;
	}

	/**
	 * Returns the unit.
	 * 
	 * @return Unit.
	 */
	@ManyToOne
	public Unit getUnit() {
		return unit;
	}

	/**
	 * Sets the unit.
	 * 
	 * @param unit
	 *            unit.
	 */
	public void setUnit(Unit unit) {
		this.unit = unit;
	}

}
