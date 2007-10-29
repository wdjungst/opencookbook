package org.ocobo.model;

import java.math.BigDecimal;

import javax.persistence.Basic;
import javax.persistence.Embeddable;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

/**
 * Describes an amount. Contains a numeric value and can be converted into a
 * fraction.
 * 
 * @author valikov
 */
@Embeddable
@XmlType
public class Amount {

	public Amount() {
	}

	public Amount(BigDecimal value) {
		setValue(value);
	}

	/**
	 * Value.
	 */
	private BigDecimal value;

	/**
	 * Returns amount value.
	 * 
	 * @return Amount value.
	 */
	@XmlValue
	@Basic
	public BigDecimal getValue() {
		return value;
	}

	/**
	 * Assigns the amount value.
	 * 
	 * @param value
	 *            New amount value.
	 */
	public void setValue(BigDecimal value) {
		this.value = value;
	}

	/**
	 * Converts the amount into the human-readable fraction. For instance,
	 * <code>2.5</code> will be converted to <code>2 1/2</code>,
	 * <code>1.33</code> will be converted to <code>1 1/3</code>.
	 * 
	 * @return Amount as fraction.
	 */
	@Transient
	public String getFraction() {
		throw new UnsupportedOperationException("Not implemented yet.");
	}

}
