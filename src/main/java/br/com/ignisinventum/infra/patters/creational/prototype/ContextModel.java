package br.com.ignisinventum.infra.patters.creational.prototype;

import br.com.ignisinventum.infra.patters.creational.prototype.interfaces.Prototype;

public class ContextModel<T extends Prototype<?>> {

	Prototype<T> prototype;

	public Prototype<T> getPrototype() {
		return prototype;
	}

	public void setPrototype(Prototype<T> prototype) {
		this.prototype = prototype;
	}

	public static void main(String[] args) {

		ContextModel<ConcretePrototypeA> contextModel = new ContextModel<>();
		contextModel.setPrototype(new ConcretePrototypeA("teste"));
		((ConcretePrototypeA) contextModel.getPrototype()).copy();

	}

}
