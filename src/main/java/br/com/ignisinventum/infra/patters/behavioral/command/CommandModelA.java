package br.com.ignisinventum.infra.patters.behavioral.command;

import br.com.ignisinventum.infra.patters.behavioral.command.interfaces.Command;

/**
 * The Class CommandModelA.
 */
@SuppressWarnings("static-access")
public class CommandModelA implements Command<CommandEnumModelA> {

	/** The command enum model A. */
	CommandEnumModelA commandEnumModelA;

	/**
	 * Execute.
	 *
	 * @param commandEnum the command enum
	 */
	@Override
	public void execute(CommandEnumModelA commandEnum) {
		commandEnumModelA.valueOf(commandEnum.toString()).action();
	}

}
