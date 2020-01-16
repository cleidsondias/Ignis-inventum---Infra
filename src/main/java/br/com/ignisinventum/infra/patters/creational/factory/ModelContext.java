package br.com.ignisinventum.infra.patters.creational.factory;

import br.com.ignisinventum.infra.patters.creational.factory.enums.ObjectProductEnum;
import br.com.ignisinventum.infra.patters.creational.factory.interfaces.Factory;

public class ModelContext {

	private static Factory<ObjectProductEnum> objectFactory = new ObjectFactory();

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		System.out.println(objectFactory.getProduct(ObjectProductEnum.object_factory_A).getNameObject());
		System.out.println(objectFactory.getProduct(ObjectProductEnum.object_factory_B).getNameObject());
	}

}
