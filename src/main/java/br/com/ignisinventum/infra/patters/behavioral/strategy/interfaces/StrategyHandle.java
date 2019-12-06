package br.com.ignisinventum.infra.patters.behavioral.strategy.interfaces;

/**
 * The Interface StrategyHandle.
 *
 * @param <T> the generic type
 */
public interface StrategyHandle<T extends Object> {

	/**
	 * Sets the value.
	 *
	 * @param value the new value
	 */
	void setResult(T value);

	/**
	 * Gets the value.
	 *
	 * @return the value
	 */
	T getResult();

}
