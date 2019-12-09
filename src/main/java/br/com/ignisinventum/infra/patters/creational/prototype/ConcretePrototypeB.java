package br.com.ignisinventum.infra.patters.creational.prototype;

import br.com.ignisinventum.infra.patters.creational.prototype.interfaces.Prototype;

public class ConcretePrototypeB implements Prototype<ConcretePrototypeB> {

	private String atrib;

	public ConcretePrototypeB(String atrib) {
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
	public ConcretePrototypeB copy() {
		return new ConcretePrototypeB(this.atrib);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return new ConcretePrototypeB(this.atrib);
	}

}
