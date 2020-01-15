package br.com.ignisinventum.infra.patters.creational.abstractfactory.juice.flavor;

import br.com.ignisinventum.infra.patters.creational.factory.interfaces.Product;

/**
 * The Class FlavorOrange.
 */
public class FlavorOrange implements Product {

	/**
	 * Gets the name object.
	 *
	 * @return the name object
	 */
	@Override
	public String getNameObject() {
		return "Flavor Orange " + this.hashCode();
	}

}