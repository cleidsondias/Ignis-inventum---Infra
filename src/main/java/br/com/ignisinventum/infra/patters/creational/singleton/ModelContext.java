package br.com.ignisinventum.infra.patters.creational.singleton;

import br.com.ignisinventum.infra.patters.creational.singleton.impl.FactorySingleton;

public class ModelContext {
	
	private static FactorySingleton factorySingleton;

	public static void main(String[] args) {
		ObjectSingletonA ObjectSingleton = (ObjectSingletonA) factorySingleton.getInstance(ObjectSingletonA.class);
		ObjectSingletonA ObjectSingletonOther = (ObjectSingletonA) factorySingleton.getInstance(ObjectSingletonA.class);
		ObjectSingletonB ObjectSingletonB = (ObjectSingletonB) factorySingleton.getInstance(ObjectSingletonB.class);
		
		System.out.println(ObjectSingleton.hashCode());
		System.out.println(ObjectSingletonOther.hashCode());
		System.out.println(ObjectSingletonB.hashCode());
	}

}
