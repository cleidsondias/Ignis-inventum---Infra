package br.com.ignisinventum.infra.patters.creational.factory;

import br.com.ignisinventum.infra.patters.creational.factory.enums.ObjectProductEnums;
import br.com.ignisinventum.infra.patters.creational.factory.interfaces.Factory;

public class ModelContext {

	private static Factory<ObjectProductEnums> objectFactory = new ObjectFactory();

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		System.out.println(objectFactory.getProduct(ObjectProductEnums.object_factory_A).getNameObject());
		System.out.println(objectFactory.getProduct(ObjectProductEnums.object_factory_B).getNameObject());
	}

}
