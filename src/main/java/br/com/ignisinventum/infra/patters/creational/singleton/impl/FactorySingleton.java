package br.com.ignisinventum.infra.patters.creational.singleton.impl;

import java.util.HashMap;
import java.util.Map;

import br.com.ignisinventum.infra.patters.creational.singleton.interfaces.Singleton;

/**
 * The Class ConcreteSingleton.
 */
public final class FactorySingleton {

	/** The instances. */
	private static final Map<Integer, Singleton<?>> instances = new HashMap<>();

	/**
	 * Instantiates a new factory singleton.
	 */
	private FactorySingleton() {

	}

	/**
	 * Gets the single instance of ConcreteSingleton.
	 *
	 * @param clz the clz
	 * @return
	 * @return single instance of ConcreteSingleton
	 */
	public static <O extends Singleton<?>> Object getInstance(Class<?> singleton) {
		try {
			for (Map.Entry<Integer, Singleton<?>> instancy : instances.entrySet()) {
				if (instancy.getValue().getClass().equals(singleton.newInstance().getClass())) {
					return instancy.getValue();
				}
			}
			Singleton<?> o = (Singleton<?>) singleton.newInstance();
			instances.put(o.hashCode(), o);
			return instances.get(o.hashCode());
		} catch (Exception e) {
			return null;
		}
	}

}
