package org.ocobo.model;

import java.util.Locale;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

/**
 * Represents internationalizable text.
 * 
 * @param <T>
 *            type of the text entry.
 */
@XmlType(name = "Text")
@Entity
public class Text {

	public Text() {
	}

	public Text(String defaultValue) {
		setDefaultValue(defaultValue);
	}

	/**
	 * Returns text value for the default locale.
	 * 
	 * @return Text value for the default locale.
	 */
	@XmlTransient
	@Transient
	public String getValue() {
		return getValue(null);
	}

	/**
	 * Returns the text value for the given locale.
	 * 
	 * @param locale
	 *            target locale, can be null.
	 * @return Localized text for the given locale, default value if locale is
	 *         <code>null</code> or not found among values.
	 */
	public String getValue(Locale locale) {
		return defaultValue;
	}

	/**
	 * Default value.
	 */
	private String defaultValue;

	@Id
	@XmlValue
	public String getDefaultValue() {
		return defaultValue;
	}

	/**
	 * Assigns the default value.
	 * 
	 * @param defaultValue
	 *            default value.
	 */
	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}

	@Override
	public String toString() {
		return getValue();
	}
}
