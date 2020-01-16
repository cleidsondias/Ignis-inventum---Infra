package br.com.ignisinventum.infra.patters.behavioral.command.enums;

import br.com.ignisinventum.infra.patters.behavioral.command.ReceiverA;
import br.com.ignisinventum.infra.patters.behavioral.command.ReceiverB;
import br.com.ignisinventum.infra.patters.behavioral.command.interfaces.CommandEnum;

/**
 * The Enum CommandModelA.
 */
public enum CommandModelEnum implements CommandEnum {

	/** The Receiver model A. */
	ReceiverA {

		/**
		 * Execute.
		 */
		@Override
		public void action() {
			receiverA.action();
		}
	},

	/** The Receiver model B. */
	ReceiverB {

		/**
		 * Execute.
		 */
		@Override
		public void action() {
			receiverB.action();
		}
	};
	
	/** The receiver model A. */
	ReceiverA receiverA = new ReceiverA();

	/** The receiver model B. */
	ReceiverB receiverB = new ReceiverB();
}
