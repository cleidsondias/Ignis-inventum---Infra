package br.com.ignisinventum.infra.patters.behavioral.strategy;

import br.com.ignisinventum.infra.patters.behavioral.strategy.interfaces.Strategy;

/**
 * The Class ConcreteModelStrategyB.
 */
public class ConcreteModelStrategyB implements Strategy<InputModelHandle, OutputModelHandle, String> {

	/**
	 * Operation.
	 *
	 * @param input the input
	 * @return the output model handle
	 */
	@Override
	public OutputModelHandle operation(InputModelHandle input) {
		OutputModelHandle outputModelHandle = new OutputModelHandle();
		outputModelHandle.setResult(input.getResult() + ": proccess by ConcreteModelStrategyB");
		return outputModelHandle;
	}

}
