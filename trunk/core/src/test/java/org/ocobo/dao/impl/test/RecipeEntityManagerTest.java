package org.ocobo.dao.impl.test;

import javax.persistence.EntityManager;

import org.ocobo.model.Ingredient;
import org.ocobo.model.Recipe;

public class RecipeEntityManagerTest extends AbstractEntityManagerTest {

  @Override
  public String getPersistenceUnitName() {
    return Recipe.class.getPackage().getName();
  }

  public void testIt() throws Exception {
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

    save(alpha);

    final int id = alpha.getId();


    final Recipe beta = load(id);
    assertEquals("Recipes differ.", alpha, beta);
  }

  public <T> void save(T a) {
    final EntityManager em = createEntityManager();
    em.getTransaction().begin();
    em.persist(a);
    em.getTransaction().commit();
    em.clear();
    em.close();
  }

  public Recipe load(int id) {
    final EntityManager em = createEntityManager();
    final Recipe a = em.find(Recipe.class, id);
    em.close();
    return a;
  }
}
