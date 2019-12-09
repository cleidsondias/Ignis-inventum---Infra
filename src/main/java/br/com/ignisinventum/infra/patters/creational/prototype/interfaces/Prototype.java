package br.com.ignisinventum.infra.patters.creational.prototype.interfaces;

/**
 * The Interface Prototype.
 *
 * @param <T> the generic type
 */
public interface Prototype<T extends Prototype<?>> extends Cloneable {

	/**
	 * Clone.
	 *
	 * @return the t
	 */
	T copy();
	
}