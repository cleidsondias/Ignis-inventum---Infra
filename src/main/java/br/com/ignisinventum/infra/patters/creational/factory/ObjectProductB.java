package br.com.ignisinventum.infra.patters.creational.factory;

import br.com.ignisinventum.infra.patters.creational.factory.interfaces.Product;

/**
 * The Class ObjectProductB.
 */
public class ObjectProductB implements Product {

	/**
	 * Gets the name object.
	 *
	 * @return the name object
	 */
	public String getNameObject() {
		return "Object Product B " + this.hashCode();
	}

}
