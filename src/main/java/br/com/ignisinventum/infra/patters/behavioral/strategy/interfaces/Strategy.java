package br.com.ignisinventum.infra.patters.behavioral.strategy.interfaces;

/**
 * The Interface Strategy.
 *
 * @param <I> the generic type extends StrategyHandle
 * @param <O> the generic type extends StrategyHandle
 * @param <T> the generic type
 */
public interface Strategy<I extends StrategyHandle<T>, O extends StrategyHandle<T>, T extends Object> {

	/**
	 * Execute.
	 *
	 * @param strategyHandle the input
	 * @return the o
	 */
	O operation(I strategyHandle);

}
