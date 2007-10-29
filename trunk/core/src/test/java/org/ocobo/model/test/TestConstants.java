package org.ocobo.model.test;

import java.math.BigDecimal;

import org.ocobo.model.Constants;
import org.ocobo.model.Ingredient;
import org.ocobo.model.IngredientFlavor;
import org.ocobo.model.IngredientOrigin;
import org.ocobo.model.IngredientType;
import org.ocobo.model.Measure;
import org.ocobo.model.Recipe;
import org.ocobo.model.RecipeComponent;
import org.ocobo.model.Text;

public class TestConstants {
	public static final IngredientFlavor INGREDIENT_FLAVOR_ALCOHOL = new IngredientFlavor(
			"Alcohol");

	public static final IngredientOrigin INGREDIENT_ORIGIN_RUSSIA = new IngredientOrigin(
			"Russia");

	public static final IngredientType INGREDIENT_TYPE_NEUTRAL_SPIRIT = new IngredientType(
			"Neutral spirit");

	public static final Ingredient VODKA = new Ingredient();

	public static final Measure MEASURE_10_CL = new Measure(BigDecimal
			.valueOf(10), Constants.CL);

	public static final Measure MEASURE_25_ML = new Measure(BigDecimal.valueOf(
			25, 1), Constants.CL);

	public static final RecipeComponent RECIPE_COMPONENT_10_CL_VODKA = new RecipeComponent(
			VODKA, MEASURE_10_CL);

	public static final Recipe RECIPE_APPLE_DANDY = new Recipe();

	static {
		VODKA.setName(new Text("Vodka"));
		VODKA.setType(INGREDIENT_TYPE_NEUTRAL_SPIRIT);
		VODKA.getAliases().add(new Text("Samogon"));
		VODKA.getAliases().add(new Text("Gor'kaja"));
		VODKA.setOrigin(INGREDIENT_ORIGIN_RUSSIA);
		VODKA.setDescription(new Text("Neutral spirit."));
		VODKA.getFlavors().add(INGREDIENT_FLAVOR_ALCOHOL);
		VODKA.setAvailability(new Text("Generally available."));

		RECIPE_APPLE_DANDY.setName(new Text("Apple dandy"));
		RECIPE_APPLE_DANDY.getAliases().add(new Text("Apple vodka"));
		RECIPE_APPLE_DANDY.setDescription(new Text(
				"Build, fill glass with ice."));
		RECIPE_APPLE_DANDY.getComponents().add(RECIPE_COMPONENT_10_CL_VODKA);
	}
}
