package br.com.ignisinventum.infra.patters.creational.abstractfactory;

import br.com.ignisinventum.infra.patters.creational.abstractfactory.car.CarFactory;
import br.com.ignisinventum.infra.patters.creational.abstractfactory.enums.FactorysEnum;
import br.com.ignisinventum.infra.patters.creational.abstractfactory.interfaces.AbstractFactory;
import br.com.ignisinventum.infra.patters.creational.abstractfactory.juice.JuiceFactory;
import br.com.ignisinventum.infra.patters.creational.factory.interfaces.Factory;

/**
 * The Class FactoryCreator.
 */
public class FactoryCreator implements AbstractFactory<FactorysEnum> {

	
	/** The factorys. */
	private Factory<?> factorys;

	/**
	 * Gets the factory.
	 *
	 * @param factory the factory
	 * @return the factory
	 */
	@Override
	public Factory<?> getFactory(FactorysEnum factory) {
		switch (FactorysEnum.valueOf(factory.toString())) {
		case car:
			factorys = new CarFactory();
			return factorys;
		case juice:
			factorys = new JuiceFactory();
			return factorys;
		}
		return null;
	}

}
