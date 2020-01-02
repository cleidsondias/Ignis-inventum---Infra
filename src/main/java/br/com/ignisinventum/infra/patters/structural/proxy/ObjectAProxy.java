package br.com.ignisinventum.infra.patters.structural.proxy;

import br.com.ignisinventum.infra.patters.structural.proxy.interfaces.Proxy;

/**
 * The Class ObjectAProxy.
 */
public class ObjectAProxy implements Proxy {

	/** The object A impl. */
	private ObjectAImpl objectAImpl = new ObjectAImpl("Access DB");

	/**
	 * Process.
	 */
	@Override
	public void process() {
		objectAImpl.process();
	}

}
