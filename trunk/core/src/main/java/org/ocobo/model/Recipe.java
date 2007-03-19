package org.ocobo.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * Describes the recipe.
 */
@Entity
@Table(name = "recipe")
public class Recipe {

  private int id = -1;

  private String title;

  private List<Ingredient> ingredients;

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

  @ManyToMany(targetEntity = Ingredient.class, cascade = CascadeType.ALL)
  public List<Ingredient> getIngredients() {
    if (ingredients == null) {
      ingredients = new ArrayList<Ingredient>(5);
    }
    return ingredients;
  }

  public void setIngredients(List<Ingredient> ingredients) {
    this.ingredients = ingredients;
  }
}
