package br.com.ignisinventum.infra.patters.creational.abstractfactory;

import br.com.ignisinventum.infra.patters.creational.abstractfactory.car.CarFactory;
import br.com.ignisinventum.infra.patters.creational.abstractfactory.car.model.enums.CarModels;
import br.com.ignisinventum.infra.patters.creational.abstractfactory.enums.Factorys;
import br.com.ignisinventum.infra.patters.creational.abstractfactory.interfaces.AbstractFactory;
import br.com.ignisinventum.infra.patters.creational.abstractfactory.juice.JuiceFactory;
import br.com.ignisinventum.infra.patters.creational.abstractfactory.juice.flavor.enums.JuiceFlavors;
import br.com.ignisinventum.infra.patters.creational.factory.interfaces.Factory;

// TODO: Auto-generated Javadoc
/**
 * The Class FactoryCreator.
 */
public class FactoryCreator implements AbstractFactory<Factorys> {

	/** The cars. */
	private Factory<CarModels> cars;

	/** The juice. */
	private Factory<JuiceFlavors> juice;

	/**
	 * Gets the factory.
	 *
	 * @param factory the factory
	 * @return the factory
	 */
	@Override
	public Factory<?> getFactory(Factorys factory) {
		switch (Factorys.valueOf(factory.toString())) {
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
