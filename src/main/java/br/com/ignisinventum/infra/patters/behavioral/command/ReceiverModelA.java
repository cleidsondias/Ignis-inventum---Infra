package br.com.ignisinventum.infra.patters.behavioral.command;

import br.com.ignisinventum.infra.patters.behavioral.command.interfaces.Receiver;

/**
 * The Class ReceiverModelA.
 */
public class ReceiverModelA implements Receiver {

	/**
	 * Action.
	 */
	@Override
	public void action() {
		System.out.println("Receiver Model A");
	}

}
