package org.ocobo.model;

/**
 * Describes the measue. Consists of amount and unit.
 */
public class Measure {

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
   * @return amount.
   */
  public Amount getAmount() {
    return amount;
  }

  /**
   * Sets the amount.
   * @param amount amount.
   */
  public void setAmount(Amount amount) {
    this.amount = amount;
  }

  /**
   * Returns the unit.
   * @return Unit.
   */
  public Unit getUnit() {
    return unit;
  }

  /**
   * Sets the unit.
   * @param unit unit.
   */
  public void setUnit(Unit unit) {
    this.unit = unit;
  }

}
