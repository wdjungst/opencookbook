package org.ocobo.dao;

/**
 * Describes a problem occured with a certain recipe.
 * This exception carries the recipe id.
 */
public class RecipeException extends Exception {

  private static final long serialVersionUID = 1L;

  private final int recipeId;

  public RecipeException(int recipeId) {
    super();
    this.recipeId = recipeId;
  }

  public RecipeException(int recipeId, String message, Throwable cause) {
    super(message, cause);
    this.recipeId = recipeId;
  }

  public RecipeException(int recipeId, String message) {
    super(message);
    this.recipeId = recipeId;
  }

  public RecipeException(int recipeId, Throwable cause) {
    super(cause);
    this.recipeId = recipeId;
  }

  /**
   * Returns the recipe id.
   * @return Recipe id.
   */
  public int getRecipeId() {
    return recipeId;
  }

}
