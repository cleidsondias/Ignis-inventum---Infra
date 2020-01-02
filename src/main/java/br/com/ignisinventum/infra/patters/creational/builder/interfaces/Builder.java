package br.com.ignisinventum.infra.patters.creational.builder.interfaces;

/**
 * The Interface Builder.
 *
 * @param <T> the generic type
 */
public interface Builder<T> {

	/**
	 * Builds the.
	 *
	 * @return the t
	 */
	T build();

}
