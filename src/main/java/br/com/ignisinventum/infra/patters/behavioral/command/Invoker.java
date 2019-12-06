package br.com.ignisinventum.infra.patters.behavioral.command;

import br.com.ignisinventum.infra.patters.behavioral.command.interfaces.Command;

/**
 * The Class Invoker.
 */
public class Invoker {

	/** The command model A. */
	Command<CommandEnumModelA> commandModelA = new CommandModelA();

	/**
	 * Command invoker.
	 */
	public void commandInvoker() {

		commandModelA.execute(CommandEnumModelA.ReceiverModelA);
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
