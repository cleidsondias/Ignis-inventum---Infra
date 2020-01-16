package br.com.ignisinventum.infra.patters.behavioral.command;

import br.com.ignisinventum.infra.patters.behavioral.command.enums.CommandModelEnum;
import br.com.ignisinventum.infra.patters.behavioral.command.interfaces.Command;

/**
 * The Class CommandModelA.
 */
@SuppressWarnings("static-access")
public class CommandModel implements Command<CommandModelEnum> {

	/** The command enum model A. */
	CommandModelEnum commandEnumModel;

	/**
	 * Execute.
	 *
	 * @param commandEnum the command enum
	 */
	@Override
	public void execute(CommandModelEnum commandEnum) {
		commandEnumModel.valueOf(commandEnum.toString()).action();
	}

}
