package br.com.ignisinventum.infra.patters.creational.builder;

import br.com.ignisinventum.infra.patters.creational.builder.interfaces.Builder;

/**
 * The Class ObjectA.
 */
@SuppressWarnings("unused")
public class ObjectA implements Builder<ObjectA> {

	/** The a. */
	private Object A;

	/** The b. */
	private Object B;

	/**
	 * Adds the object A.
	 *
	 * @param A the a
	 * @return the object A
	 */
	public ObjectA addObjectA(Object A) {
		setA(A);
		return this;
	}

	/**
	 * Adds the object B.
	 *
	 * @param B the b
	 * @return the object A
	 */
	public ObjectA addObjectB(Object B) {
		setB(B);
		return this;
	}

	/**
	 * Builds the.
	 *
	 * @return the object A
	 */
	@Override
	public ObjectA build() {
		return this;
	}

	/**
	 * Sets the a.
	 *
	 * @param a the new a
	 */
	private void setA(Object a) {
		A = a;
	}

	/**
	 * Sets the b.
	 *
	 * @param b the new b
	 */
	private void setB(Object b) {
		B = b;
	}

}
