package org.ocobo.model;

import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Recipe component consiste of a measure and ingredient.
 */
@XmlType
@XmlRootElement(name = "recipeComponent")
public class RecipeComponent {

	private long id;

	@XmlAttribute
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public RecipeComponent() {
	}

	public RecipeComponent(Ingredient ingredient, Measure measure) {
		setIngredient(ingredient);
		setMeasure(measure);
	}

	private Measure measure;

	private Ingredient ingredient;

	@ManyToOne
	public Measure getMeasure() {
		return measure;
	}

	public void setMeasure(Measure measure) {
		this.measure = measure;
	}

	@ManyToOne
	public Ingredient getIngredient() {
		return ingredient;
	}

	public void setIngredient(Ingredient ingredient) {
		this.ingredient = ingredient;
	}
}