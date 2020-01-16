package br.com.ignisinventum.infra.patters.creational.factory;

import br.com.ignisinventum.infra.patters.creational.factory.enums.ObjectProductEnum;
import br.com.ignisinventum.infra.patters.creational.factory.interfaces.Factory;
import br.com.ignisinventum.infra.patters.creational.factory.interfaces.Product;

public class ObjectFactory implements Factory<ObjectProductEnum>{
	
	Product product;

	@Override
	public Product getProduct(ObjectProductEnum objectProductEnums) {
		switch (ObjectProductEnum.valueOf(objectProductEnums.toString())) {
		case object_factory_A:
			return new ObjectProductA();
		case object_factory_B:
			return new ObjectProductB();
		case object_factory_C:
			return new ObjectProductC();
		}
		return null;
	}
}
