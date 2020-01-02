package br.com.ignisinventum.infra.patters.structural.proxy;

import br.com.ignisinventum.infra.patters.structural.proxy.interfaces.Proxy;

/**
 * The Class ObjectAImpl.
 */
public class ObjectAImpl implements Proxy {

	/** The config. */
	private String config;

	/**
	 * Instantiates a new object A impl.
	 *
	 * @param config the config
	 */
	public ObjectAImpl(String config) {
		System.out.println("Initial Config for Object A Implementation");
		this.config = config;
	}

	/**
	 * Process.
	 */
	@Override
	public void process() {
		System.out.println(this.config);
	}

}