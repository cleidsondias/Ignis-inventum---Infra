package br.com.ignisinventum.infra.patters.structural.proxy;

import br.com.ignisinventum.infra.patters.structural.proxy.interfaces.Proxy;

public class ModelContext {

	private static Proxy objectAProxy;

	public static void main(String[] args) {
		setObjectAProxy(getObjectAProxy());
		objectAProxy.process();
		objectAProxy.process();
		objectAProxy.process();
	}

	private static Proxy getObjectAProxy() {
		return new ObjectAProxy();
	}

	private static void setObjectAProxy(Proxy objectAProxy) {
		ModelContext.objectAProxy = objectAProxy;
	}

}
