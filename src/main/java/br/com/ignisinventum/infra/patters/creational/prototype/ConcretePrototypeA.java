package br.com.ignisinventum.infra.patters.creational.prototype;

import br.com.ignisinventum.infra.patters.creational.prototype.interfaces.Prototype;

public class ConcretePrototypeA implements Prototype<ConcretePrototypeA> {

	private String atrib;

	public ConcretePrototypeA(String atrib) {
		super();
		this.atrib = atrib;
	}

	public String getAtrib() {
		return atrib;
	}

	public void setAtrib(String atrib) {
		this.atrib = atrib;
	}

	@Override
	public ConcretePrototypeA copy() {
		return new ConcretePrototypeA(this.atrib);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return new ConcretePrototypeA(this.atrib);
	}

}
