package br.com.ignisinventum.infra.patters.creational.factory;

import br.com.ignisinventum.infra.patters.creational.factory.interfaces.Product;

/**
 * The Class ObjectProductA.
 */
public class ObjectProductA implements Product {

	/**
	 * Gets the name object.
	 *
	 * @return the name object
	 */
	public String getNameObject() {
		return "Object Product A " + this.hashCode();
	}

}
