package br.com.ignisinventum.infra.patters.creational.abstractfactory.car;

import br.com.ignisinventum.infra.patters.creational.abstractfactory.car.model.ModelA;
import br.com.ignisinventum.infra.patters.creational.abstractfactory.car.model.ModelB;
import br.com.ignisinventum.infra.patters.creational.abstractfactory.car.model.enums.CarModelsEnum;
import br.com.ignisinventum.infra.patters.creational.factory.interfaces.Factory;
import br.com.ignisinventum.infra.patters.creational.factory.interfaces.Product;

/**
 * A factory for creating Car objects.
 */
public class CarFactory implements Factory<CarModelsEnum> {

	/**
	 * Gets the product.
	 *
	 * @param carModels the car models
	 * @return the product
	 */
	@Override
	public Product getProduct(CarModelsEnum carModels) {
		switch (CarModelsEnum.valueOf(carModels.toString())) {
		case model_car_A:
			return new ModelA();
		case model_car_B:
			return new ModelB();
		}
		return null;
	}

}
