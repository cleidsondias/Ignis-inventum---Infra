package br.com.ignisinventum.infra.patters.behavioral.command;

import br.com.ignisinventum.infra.patters.behavioral.command.interfaces.Command;

/**
 * The Class CommandModelA.
 */
@SuppressWarnings("static-access")
public class CommandModel implements Command<CommandEnumModel> {

	/** The command enum model A. */
	CommandEnumModel commandEnumModel;

	/**
	 * Execute.
	 *
	 * @param commandEnum the command enum
	 */
	@Override
	public void execute(CommandEnumModel commandEnum) {
		commandEnumModel.valueOf(commandEnum.toString()).action();
	}

}
