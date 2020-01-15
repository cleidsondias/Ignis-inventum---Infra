package br.com.ignisinventum.infra.patters.creational.abstractfactory;

import br.com.ignisinventum.infra.patters.creational.abstractfactory.car.CarFactory;
import br.com.ignisinventum.infra.patters.creational.abstractfactory.car.model.enums.CarModels;
import br.com.ignisinventum.infra.patters.creational.abstractfactory.enums.Factorys;
import br.com.ignisinventum.infra.patters.creational.abstractfactory.interfaces.AbstractFactory;
import br.com.ignisinventum.infra.patters.creational.abstractfactory.juice.JuiceFactory;
import br.com.ignisinventum.infra.patters.creational.abstractfactory.juice.flavor.enums.JuiceFlavors;

public class ModelContext {

	private static AbstractFactory<Factorys> factoryCreator = new FactoryCreator();

	public static void main(String[] args) {
		System.out.println(((CarFactory) factoryCreator.getFactory(Factorys.car)).getProduct(CarModels.model_car_A)
				.getNameObject());
		System.out.println(((JuiceFactory) factoryCreator.getFactory(Factorys.juice))
				.getProduct(JuiceFlavors.juice_flavor_orange).getNameObject());

	}

}
