package br.com.ignisinventum.infra.patters.creational.abstractfactory;

import br.com.ignisinventum.infra.patters.creational.abstractfactory.car.CarFactory;
import br.com.ignisinventum.infra.patters.creational.abstractfactory.car.model.enums.CarModelsEnum;
import br.com.ignisinventum.infra.patters.creational.abstractfactory.enums.FactorysEnum;
import br.com.ignisinventum.infra.patters.creational.abstractfactory.interfaces.AbstractFactory;
import br.com.ignisinventum.infra.patters.creational.abstractfactory.juice.JuiceFactory;
import br.com.ignisinventum.infra.patters.creational.abstractfactory.juice.flavor.enums.JuiceFlavorsEnum;
import br.com.ignisinventum.infra.patters.creational.factory.interfaces.Factory;

// TODO: Auto-generated Javadoc
/**
 * The Class FactoryCreator.
 */
public class FactoryCreator implements AbstractFactory<FactorysEnum> {

	/** The cars. */
	private Factory<CarModelsEnum> cars;

	/** The juice. */
	private Factory<JuiceFlavorsEnum> juice;

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
			cars = new CarFactory();
			return cars;
		case juice:
			juice = new JuiceFactory();
			return juice;
		}
		return null;
	}

}
