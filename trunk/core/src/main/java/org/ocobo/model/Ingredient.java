package org.ocobo.model;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Describes the ingredient.
 */
@Entity
@Table(name = "ingredient")
public class Ingredient {

  private int id;

  private String title;

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  @Basic
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }
}
