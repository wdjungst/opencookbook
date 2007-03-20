package org.ocobo.dao;

import org.ocobo.model.Recipe;

/**
 * Dao service for recipes.
 */
public interface RecipeDao {

  /**
   * Saves the recipe.
   * @param recipe recipe to save.
   * @return The saved recipe.
   */
  public Recipe saveRecipe(Recipe recipe) throws RecipeException;

  /**
   * Loads the recipe by id.
   * @param id recipe id.
   * @return Loaded recipe.
   */
  public Recipe loadRecipe(int id) throws RecipeException;

  /**
   * Removes the recipe by id.
   * @param id recipe id.
   * @return Removed recipe.
   */
  public Recipe removeRecipe(int id) throws RecipeException;

  /**
   * Removes the recipe.
   * @param recipe the recipe
   * @return Removed recipe.
   */
  public Recipe removeRecipe(Recipe recipe) throws RecipeException;

}
