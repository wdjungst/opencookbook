package org.ocobo.model;

import java.util.Collection;
import java.util.Locale;

/**
 * Represents internationalizable text.
 * @param <T> type of the text entry.
 */
public abstract class AbstractText<T extends AbstractText.Entry> {

  /**
   * Returns text value for the default locale.
   * @return Text value for the default locale.
   */
  public String getValue() {
    return getValue(null);
  }

  /**
   * Returns the text value for the given locale.
   * @param locale target locale, can be null.
   * @return Localized text for the given locale, default value if locale is
   * <code>null</code> or not found among values.
   */
  public String getValue(Locale locale) {
    return defaultValue;
  }

  /**
   * Default value.
   */
  private String defaultValue;

  /**
   * Localized values.
   */
  private Collection<T> values;

  /**
   * Returns default value.
   * @return Default value.
   */
  public String getDefaultValue() {
    return defaultValue;
  }

  /**
   * Assigns the default value.
   * @param defaultValue default value.
   */
  public void setDefaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
  }

  /**
   * Returns localized values.
   * @return Localized values.
   */
  public Collection<T> getValues() {
    return values;
  }

  /**
   * Assigns localized values.
   * @param values localized values.
   */
  public void setValues(Collection<T> values) {
    this.values = values;
  }

  /**
   * Localized text entry.
   */
  public static class Entry {

    /**
     * Locale.
     */
    private Locale locale;

    /**
     * Value.
     */
    private String value;

    /**
     * Returns locale.
     * @return Locale.
     */
    public Locale getLocale() {
      return locale;
    }

    /**
     * Assigns locale.
     * @param locale locale.
     */
    public void setLocale(Locale locale) {
      this.locale = locale;
    }

    /**
     * Retuns value.
     * @return Value.
     */
    public String getValue() {
      return value;
    }

    /**
     * Assigns value.
     * @param value value.
     */
    public void setValue(String value) {
      this.value = value;
    }
  }
}
