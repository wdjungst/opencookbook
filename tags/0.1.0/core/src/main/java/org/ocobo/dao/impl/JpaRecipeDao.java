package org.ocobo.dao.impl;

import org.ocobo.dao.RecipeDao;
import org.ocobo.dao.RecipeException;
import org.ocobo.model.Recipe;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.jpa.support.JpaDaoSupport;
import org.springframework.transaction.annotation.Transactional;

@Transactional(rollbackFor = { RecipeException.class })
public class JpaRecipeDao extends JpaDaoSupport implements RecipeDao {

  @Transactional(readOnly = true)
  public Recipe loadRecipe(int id) throws RecipeException {
    try {
      return (Recipe) getJpaTemplate().find(Recipe.class, id);
    }
    catch (DataAccessException ex) {
      throw new RecipeException(id, "Error loading the recipe.", ex);
    }
  }

  @Transactional
  public Recipe saveRecipe(Recipe recipe) throws RecipeException {
    try {
      getJpaTemplate().persist(recipe);
      return recipe;
    }
    catch (DataAccessException ex) {
      throw new RecipeException(recipe.getId(), "Error saving the recipe.", ex);
    }
  }

  @Transactional
  public Recipe removeRecipe(int id) throws RecipeException {
    try {
      final Recipe recipe = loadRecipe(id);
      return removeRecipe(recipe);
    }
    catch (DataAccessException ex) {
      throw new RecipeException(id, "Error removing the recipe.", ex);
    }
  }

  @Transactional
  public Recipe removeRecipe(Recipe recipe) throws RecipeException {
    try {
      getJpaTemplate().remove(recipe);
      return recipe;
    }
    catch (DataAccessException ex) {
      throw new RecipeException(recipe.getId(), "Error removing the recipe.", ex);
    }
  }

}
