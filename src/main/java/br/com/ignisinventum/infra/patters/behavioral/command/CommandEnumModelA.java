package br.com.ignisinventum.infra.patters.behavioral.command;

import br.com.ignisinventum.infra.patters.behavioral.command.interfaces.CommandEnum;

/**
 * The Enum CommandModelA.
 */
public enum CommandEnumModelA implements CommandEnum {

	/** The Receiver model A. */
	ReceiverModelA {

		/**
		 * Execute.
		 */
		@Override
		public void action() {
			receiverModelA.action();
		}
	},

	/** The Receiver model B. */
	ReceiverModelB {

		/**
		 * Execute.
		 */
		@Override
		public void action() {
			receiverModelB.action();
		}
	};

	/** The receiver model A. */
	ReceiverModelA receiverModelA = new ReceiverModelA();

	/** The receiver model B. */
	ReceiverModelB receiverModelB = new ReceiverModelB();

}
