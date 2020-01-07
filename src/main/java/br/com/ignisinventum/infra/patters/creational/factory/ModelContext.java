package br.com.ignisinventum.infra.patters.creational.factory;

import br.com.ignisinventum.infra.patters.creational.factory.enums.ObjectProductEnums;

public class ModelContext {

	private static ObjectFactory objectFactory = new ObjectFactory();

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		System.out.println(objectFactory.getProduct(ObjectProductEnums.object_factory_A).getNameObject());
		System.out.println(objectFactory.getProduct(ObjectProductEnums.object_factory_B).getNameObject());
	}

}
