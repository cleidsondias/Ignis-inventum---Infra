package br.com.ignisinventum.infra.patters.creational.abstractfactory;

import br.com.ignisinventum.infra.patters.creational.abstractfactory.car.CarFactory;
import br.com.ignisinventum.infra.patters.creational.abstractfactory.car.model.enums.CarModelsEnum;
import br.com.ignisinventum.infra.patters.creational.abstractfactory.enums.FactorysEnum;
import br.com.ignisinventum.infra.patters.creational.abstractfactory.interfaces.AbstractFactory;
import br.com.ignisinventum.infra.patters.creational.abstractfactory.juice.JuiceFactory;
import br.com.ignisinventum.infra.patters.creational.abstractfactory.juice.flavor.enums.JuiceFlavorsEnum;

public class ModelContext {

	private static AbstractFactory<FactorysEnum> factoryCreator = new FactoryCreator();

	public static void main(String[] args) {
		System.out.println(((CarFactory) factoryCreator.getFactory(FactorysEnum.car)).getProduct(CarModelsEnum.model_car_A)
				.getNameObject());
		System.out.println(((JuiceFactory) factoryCreator.getFactory(FactorysEnum.juice))
				.getProduct(JuiceFlavorsEnum.juice_flavor_orange).getNameObject());

	}

}
