package br.com.ignisinventum.infra.patters.creational.abstractfactory.juice;

import br.com.ignisinventum.infra.patters.creational.abstractfactory.juice.flavor.FlavorGrape;
import br.com.ignisinventum.infra.patters.creational.abstractfactory.juice.flavor.FlavorOrange;
import br.com.ignisinventum.infra.patters.creational.abstractfactory.juice.flavor.enums.JuiceFlavorsEnum;
import br.com.ignisinventum.infra.patters.creational.factory.interfaces.Factory;
import br.com.ignisinventum.infra.patters.creational.factory.interfaces.Product;

public class JuiceFactory implements Factory<JuiceFlavorsEnum> {

	@Override
	public Product getProduct(JuiceFlavorsEnum juiceFlavors) {
		switch (JuiceFlavorsEnum.valueOf(juiceFlavors.toString())) {
		case juice_flavor_orange:
			return new FlavorOrange();
		case juice_flavor_grape:
			return new FlavorGrape();
		}
		
		return null;
	}


}
	