package br.com.ignisinventum.infra.patters.creational.factory.interfaces;

/**
 * The Interface Factory.
 *
 * @param <T> the generic type
 */
public interface Factory<T extends ProductEnum> {

	/**
	 * Gets the product.
	 *
	 * @param productEnums the product enums
	 * @return the product
	 */
	Product getProduct(T productEnums);
}
