package org.ocobo.model.test;

import java.io.OutputStreamWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import junit.framework.TestCase;

import org.ocobo.model.Recipe;

public class JAXBContextTest extends TestCase {

	private JAXBContext context;

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		// final Map<String, Object> properties = new HashMap<String, Object>();
		// properties.put(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		context = JAXBContext.newInstance(Recipe.class);
	}

	public void testMarshallIngredient() throws Exception {

		final Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

		marshaller.marshal(TestConstants.VODKA,

		new OutputStreamWriter(System.out));

	}

	public void testMarshallRecipe() throws Exception {
		final Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

		marshaller.marshal(TestConstants.RECIPE_APPLE_DANDY,

		new OutputStreamWriter(System.out));
	}

	// public void testUnmarshallText() throws Exception {
	//
	// SimpleText text = (SimpleText) context.createUnmarshaller().unmarshal(
	// getClass().getResourceAsStream("Text[0].xml"));
	//
	// Assert.assertEquals("test", text.getDefaultValue());
	// Assert.assertEquals("test", text.getValue(Locale.ENGLISH));
	// Assert.assertEquals("test", text.getValue(Locale.GERMAN));
	// }
}
