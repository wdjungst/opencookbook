package org.ocobo.model;

import java.util.Collection;

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

  private Text name;
  private Collection<Text> aliases;
  private Type type;
  private WikiText description;
  private Collection<Flavor> flavors;
  private Origin origin;
  private Text availability;

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

  public WikiText getDescription() {
    return description;
  }

  public void setDescription(WikiText description) {
    this.description = description;
  }

  public Collection<Flavor> getFlavors() {
    return flavors;
  }

  public void setFlavors(Collection<Flavor> flavors) {
    this.flavors = flavors;
  }

  public Origin getOrigin() {
    return origin;
  }

  public void setOrigin(Origin origin) {
    this.origin = origin;
  }

  public Text getAvailability() {
    return availability;
  }

  public void setAvailability(Text availability) {
    this.availability = availability;
  }

  /**
   * Type of the ingredient.
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
   * Flavor of the ingredient.
   */
  public static class Flavor {

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
   * Origin of the ingredient.
   */
  public static class Origin {

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
}
