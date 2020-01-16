package br.com.ignisinventum.infra.patters.creational.singleton;

import br.com.ignisinventum.infra.patters.creational.singleton.impl.FactorySingleton;

/**
 * The Class ModelContext.
 */
@SuppressWarnings("static-access")
public class ModelContext {

	/** The factory singleton. */
	private static FactorySingleton factorySingleton;

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		ObjectSingletonA ObjectSingleton = (ObjectSingletonA) factorySingleton.getInstance(ObjectSingletonA.class);
		ObjectSingletonA ObjectSingletonOther = (ObjectSingletonA) factorySingleton.getInstance(ObjectSingletonA.class);
		ObjectSingletonB ObjectSingletonB = (ObjectSingletonB) factorySingleton.getInstance(ObjectSingletonB.class);

		System.out.println(ObjectSingleton.hashCode());
		System.out.println(ObjectSingletonOther.hashCode());
		System.out.println(ObjectSingletonB.hashCode());
	}

}
