package org.ocobo.model;

/**
 * Unit of measure.
 */
public class Unit {

  /**
   * Name.
   */
  private Text name;

  /**
   * Description.
   */
  private WikiText description;

  /**
   * Returns name.
   * @return name.
   */
  public Text getName() {
    return name;
  }

  /**
   * Sets name.
   * @param name name.
   */
  public void setName(Text name) {
    this.name = name;
  }

  /**
   * Returns description.
   * @return Description.
   */
  public WikiText getDescription() {
    return description;
  }

  /**
   * Sets description.
   * @param description description.
   */
  public void setDescription(WikiText description) {
    this.description = description;
  }
}
