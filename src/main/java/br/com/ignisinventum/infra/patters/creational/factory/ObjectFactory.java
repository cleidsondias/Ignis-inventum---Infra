package br.com.ignisinventum.infra.patters.creational.factory;

import br.com.ignisinventum.infra.patters.creational.factory.enums.ObjectProductEnums;
import br.com.ignisinventum.infra.patters.creational.factory.interfaces.Factory;
import br.com.ignisinventum.infra.patters.creational.factory.interfaces.Product;

public class ObjectFactory implements Factory<ObjectProductEnums>{
	
	Product product;

	@Override
	public Product getProduct(ObjectProductEnums objectProductEnums) {
		switch (ObjectProductEnums.valueOf(objectProductEnums.toString())) {
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
