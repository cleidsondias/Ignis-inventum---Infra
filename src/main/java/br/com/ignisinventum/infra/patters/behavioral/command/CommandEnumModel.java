package br.com.ignisinventum.infra.patters.behavioral.command;

import br.com.ignisinventum.infra.patters.behavioral.command.interfaces.CommandEnum;

/**
 * The Enum CommandModelA.
 */
public enum CommandEnumModel implements CommandEnum {

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
