package br.com.ignisinventum.infra.patters.creational.abstractfactory.car.model;

import br.com.ignisinventum.infra.patters.creational.factory.interfaces.Product;

/**
 * The Class ModelB.
 */
public class ModelB implements Product {

	/**
	 * Gets the name object.
	 *
	 * @return the name object
	 */
	@Override
	public String getNameObject() {
		return "Model Car B " + this.hashCode();
	}

}
