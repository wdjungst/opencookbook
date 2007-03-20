package org.ocobo.dao.test;

import org.ocobo.dao.RecipeDao;
import org.ocobo.model.Ingredient;
import org.ocobo.model.Recipe;
import org.ocobo.test.AbstractDependencyInjectionSpringContextTests;

public class RecipeDaoTest extends AbstractDependencyInjectionSpringContextTests
//extends AbstractTransactionalSpringContextTests 
{

  private RecipeDao recipeDao;

  public RecipeDao getRecipeDao() {
    return recipeDao;
  }

  public void setRecipeDao(RecipeDao recipeDao) {
    this.recipeDao = recipeDao;
  }

  public void testSimpleRoundtrip() throws Exception {

    final Recipe alpha;
    {
      alpha = new Recipe();
      alpha.setTitle("alpha");

      final Ingredient one = new Ingredient();
      one.setTitle("one");
      final Ingredient two = new Ingredient();
      two.setTitle("two");
      final Ingredient three = new Ingredient();
      three.setTitle("three");

      alpha.getIngredients().add(one);
      alpha.getIngredients().add(two);
      alpha.getIngredients().add(three);
    }

    getRecipeDao().saveRecipe(alpha);

    final int id = alpha.getId();

    final Recipe beta = getRecipeDao().loadRecipe(id);

//    assertEquals("Recipes differ.", alpha, beta);
    assertEquals("Recipe titles differ.", alpha.getTitle(), beta.getTitle());
    
    getRecipeDao().removeRecipe(id);
  }
}
