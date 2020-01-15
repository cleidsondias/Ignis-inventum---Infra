package br.com.ignisinventum.infra.patters.creational.abstractfactory.interfaces;

import br.com.ignisinventum.infra.patters.creational.factory.interfaces.Factory;

/**
 * A factory for creating Abstract objects.
 *
 * @param <T> the generic type
 */
public interface AbstractFactory<T extends FactoryEnums> {

	/**
	 * Gets the factory.
	 *
	 * @param factory the factory
	 * @return the factory
	 */
	Factory<?> getFactory(T factory);
	
}