package br.com.ignisinventum.infra.patters.creational.builder;

import br.com.ignisinventum.infra.patters.creational.builder.interfaces.Builder;

/**
 * The Class ModelContext.
 */
public class ModelContext {

	/** The builder. */
	private static Builder<ObjectA> builder;

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		setBuilder(new ObjectA().addObjectA(new Object()).addObjectB(new Object()).build());
		System.out.println(getBuilder().hashCode());
	}

	/**
	 * Gets the builder.
	 *
	 * @return the builder
	 */
	public static Builder<ObjectA> getBuilder() {
		return builder;
	}

	/**
	 * Sets the builder.
	 *
	 * @param builder the new builder
	 */
	public static void setBuilder(Builder<ObjectA> builder) {
		ModelContext.builder = builder;
	}
}
