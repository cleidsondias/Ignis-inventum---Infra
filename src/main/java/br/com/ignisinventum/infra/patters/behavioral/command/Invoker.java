package br.com.ignisinventum.infra.patters.behavioral.command;

import br.com.ignisinventum.infra.patters.behavioral.command.interfaces.Command;

/**
 * The Class Invoker.
 */
public class Invoker {

	/** The command model A. */
	Command<CommandEnumModel> commandModel = new CommandModel();

	/**
	 * Command invoker.
	 */
	public void commandInvoker() {

		commandModel.execute(CommandEnumModel.ReceiverA);
	}

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		Invoker invoker = new Invoker();
		invoker.commandInvoker();
	}

}
