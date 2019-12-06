package br.com.ignisinventum.infra.patters.behavioral.strategy;

import br.com.ignisinventum.infra.patters.behavioral.strategy.interfaces.StrategyHandle;

/**
 * The Class OutputModelHandle.
 */
public class OutputModelHandle implements StrategyHandle<String> {

	/** The value. */
	private String result;

	/**
	 * Sets the result.
	 *
	 * @param result the new result
	 */
	@Override
	public void setResult(String result) {
		this.result = result;

	}

	/**
	 * Gets the result.
	 *
	 * @return the result
	 */
	@Override
	public String getResult() {
		return this.result;
	}

}
