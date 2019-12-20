package br.com.ignisinventum.infra.patters.structural.composite.interfaces;

import java.util.List;

/**
 * The Interface Composite.
 *
 * @param <T> the generic type
 */
public interface Composite<T extends Component> {

	/**
	 * Adds the.
	 *
	 * @param t the t
	 * @return the t
	 */
	T add(T t);
	
	/**
	 * Removes the.
	 *
	 * @param t the t
	 * @return the t
	 */
	T remove(T t);
	
	/**
	 * Gets the children.
	 *
	 * @return the children
	 */
	List<T> getChildren();

	/**
	 * Size.
	 *
	 * @return the integer
	 */
	Integer size();

	/**
	 * Degree.
	 *
	 * @return the integer
	 */
	Integer degree();

}
 