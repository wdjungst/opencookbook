package org.ocobo.model;

import java.math.BigDecimal;

/**
 * Describes an amount. Contains a numeric value and can be converted
 * into a fraction.
 * @author valikov
 */
public class Amount {

  /**
   * Value.
   */
  private BigDecimal value;

  /**
   * Returns amount value.
   * @return Amount value.
   */
  public BigDecimal getValue() {
    return value;
  }

  /**
   * Assigns the amount value.
   * @param value New amount value.
   */
  public void setValue(BigDecimal value) {
    this.value = value;
  }

  /**
   * Converts the amount into the human-readable fraction. For instance,
   * <code>2.5</code> will be converted to <code>2 1/2</code>,
   * <code>1.33</code> will be converted to <code>1 1/3</code>.
   * @return Amount as fraction.
   */
  public String getFraction() {
    throw new UnsupportedOperationException("Not implemented yet.");
  }

}
