package br.com.ignisinventum.infra.patters.behavioral.strategy.interfaces;

/**
 * The Interface Strategy.
 *
 * @param <I> the generic type extends StrategyHandle
 * @param <O> the generic type extends StrategyHandle
 */
public interface Strategy<I extends StrategyHandle, O extends StrategyHandle> {

	/**
	 * Execute.
	 *
	 * @param input the input
	 * @return the o
	 */
	O execute(I input);

}
