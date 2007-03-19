package org.ocobo.dao.test;

import org.junit.Test;
import org.ocobo.dao.RecipeDao;
import org.ocobo.model.Ingredient;
import org.ocobo.model.Recipe;
import static org.junit.Assert.*;

public class RecipeDaoTest {

  private RecipeDao recipeDao;

  public RecipeDao getRecipeDao() {
    return recipeDao;
  }

  public void setRecipeDao(RecipeDao recipeDao) {
    this.recipeDao = recipeDao;
  }

  @Test
  public void simpleRoundtrip() throws Exception {

    final Recipe alpha;
    {
      alpha = new Recipe();
      alpha.setTitle("alpha");

      final Ingredient one = new Ingredient();
      one.setTitle("one");
      final Ingredient two = new Ingredient();
      one.setTitle("two");
      final Ingredient three = new Ingredient();
      one.setTitle("thre");

      alpha.getIngredients().add(one);
      alpha.getIngredients().add(two);
      alpha.getIngredients().add(three);
    }

    getRecipeDao().saveRecipe(alpha);

    final int id = alpha.getId();

    final Recipe beta = getRecipeDao().loadRecipe(id);

    assertEquals("Recipes differ.", alpha, beta);
  }
}
