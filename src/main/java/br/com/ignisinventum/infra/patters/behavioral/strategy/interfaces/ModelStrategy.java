package br.com.ignisinventum.infra.patters.behavioral.strategy.interfaces;

/**
 * The Interface ModelStrategy.
 *
 * @param <M> the generic type of ModelOperationInterface
 * @param <O> the generic type of StrategyHandle
 * @param <T> the generic type of Object
 */
public interface ModelStrategy<M extends ModelOperationInterface, O extends StrategyHandle<T>, T extends Object> {

	/**
	 * Execute strategy.
	 *
	 * @param modelOperationInterface the model operation interface
	 * @return the o
	 */
	O doOperation(M modelOperationInterface);

	/**
	 * Gets the model operation enum.
	 *
	 * @return the model operation enum
	 */
	M getModelOperationEnum();

}
