package br.com.ignisinventum.infra.patters.creational.abstractfactory.juice.flavor;

import br.com.ignisinventum.infra.patters.creational.factory.interfaces.Product;

/**
 * The Class FlavorGrape.
 */
public class FlavorGrape implements Product {

	/**
	 * Gets the name object.
	 *
	 * @return the name object
	 */
	@Override
	public String getNameObject() {
		return "Flavor Grape " + this.hashCode();
	}

}