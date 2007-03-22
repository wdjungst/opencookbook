package org.ocobo.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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

  private Text name;
  private Collection<Text> aliases;
  private Type type;
  private Collection<Component> components;
  private WikiText description;
  private Collection<Utensil> utensils;
  private Vessel vessel;

  public Text getName() {
    return name;
  }

  public void setName(Text name) {
    this.name = name;
  }

  public Collection<Text> getAliases() {
    return aliases;
  }

  public void setAliases(Collection<Text> aliases) {
    this.aliases = aliases;
  }

  public Type getType() {
    return type;
  }

  public void setType(Type type) {
    this.type = type;
  }

  public Collection<Component> getComponents() {
    return components;
  }

  public void setComponents(Collection<Component> components) {
    this.components = components;
  }

  public WikiText getDescription() {
    return description;
  }

  public void setDescription(WikiText description) {
    this.description = description;
  }

  public Collection<Utensil> getUtensils() {
    return utensils;
  }

  public void setUtensils(Collection<Utensil> utensils) {
    this.utensils = utensils;
  }

  public Vessel getVessel() {
    return vessel;
  }

  public void setVessel(Vessel vessel) {
    this.vessel = vessel;
  }

  /**
   * Type of the recipe.
   */
  public static class Type {

    private Text name;
    private WikiText description;

    public Text getName() {
      return name;
    }

    public void setName(Text name) {
      this.name = name;
    }

    public WikiText getDescription() {
      return description;
    }

    public void setDescription(WikiText description) {
      this.description = description;
    }
  }

  /**
   * Recipe component consiste of a measure and ingredient.
   */
  public static class Component {
    private Measure measure;
    private Ingredient ingredient;

    public Measure getMeasure() {
      return measure;
    }

    public void setMeasure(Measure measure) {
      this.measure = measure;
    }

    public Ingredient getIngredient() {
      return ingredient;
    }

    public void setIngredient(Ingredient ingredient) {
      this.ingredient = ingredient;
    }
  }
}