package br.com.ignisinventum.infra.patters.behavioral.command;

import br.com.ignisinventum.infra.patters.behavioral.command.interfaces.Receiver;

/**
 * The Class ReceiverModelB.
 */
public class ReceiverModelB implements Receiver {

	/**
	 * Action.
	 */
	@Override
	public void action() {
		System.out.println("Receiver Model B");
	}

}