package org.ocobo.dao;

/**
 * Describes a problem occured with a certain recipe.
 * This exception carries the recipe id.
 */
public class RecipeException extends Exception {

  private static final long serialVersionUID = 1L;

  private final String recipeId;

  public RecipeException(String recipeId) {
    super();
    this.recipeId = recipeId;
  }

  public RecipeException(String recipeId, String message, Throwable cause) {
    super(message, cause);
    this.recipeId = recipeId;
  }

  public RecipeException(String recipeId, String message) {
    super(message);
    this.recipeId = recipeId;
  }

  public RecipeException(String recipeId, Throwable cause) {
    super(cause);
    this.recipeId = recipeId;
  }

  /**
   * Returns the recipe id.
   * @return Recipe id.
   */
  public String getRecipeId() {
    return recipeId;
  }

}
