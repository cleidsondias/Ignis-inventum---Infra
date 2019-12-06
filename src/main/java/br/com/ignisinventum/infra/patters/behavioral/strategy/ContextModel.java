package br.com.ignisinventum.infra.patters.behavioral.strategy;

import br.com.ignisinventum.infra.patters.behavioral.strategy.enums.ModelOperationEnum;
import br.com.ignisinventum.infra.patters.behavioral.strategy.interfaces.ModelStrategy;
import br.com.ignisinventum.infra.patters.behavioral.strategy.interfaces.Strategy;
import br.com.ignisinventum.infra.patters.behavioral.strategy.interfaces.StrategyHandle;

/**
 * The Class ContextModel.
 */
public class ContextModel implements ModelStrategy<ModelOperationEnum, OutputModelHandle, String> {

	/** The strategy. */
	private Strategy<InputModelHandle, OutputModelHandle, String> strategy;

	/** The strategy handle. */
	private StrategyHandle<String> strategyHandle;

	/** The model operation enum. */
	private ModelOperationEnum modelOperationEnum;

	/**
	 * Execute strategy.
	 *
	 * @param strategyEnumInterface the strategy enum interface
	 * @return the output model handle
	 */
	@Override
	public OutputModelHandle doOperation(ModelOperationEnum strategyEnumInterface) {
		switch (ModelOperationEnum.valueOf(strategyEnumInterface.toString())) {
		case operationA:
			strategy = new ConcreteModelStrategyA();
			strategyHandle = new InputModelHandle();
			strategyHandle.setResult("Test");
			return strategy.operation((InputModelHandle) strategyHandle);

		case operationB:
			strategy = new ConcreteModelStrategyB();
			strategyHandle = new InputModelHandle();
			strategyHandle.setResult("Test");
			return strategy.operation((InputModelHandle) strategyHandle);
		}
		return null;
	}

	/**
	 * Gets the model operation enum.
	 *
	 * @return the model operation enum
	 */
	public ModelOperationEnum getModelOperationEnum() {
		return modelOperationEnum;
	}

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		ContextModel contextModel = new ContextModel();
		contextModel.getModelOperationEnum();
		System.out.println(contextModel.doOperation(ModelOperationEnum.operationA).getResult());
	}
}
