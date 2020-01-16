package br.com.ignisinventum.infra.patters.behavioral.command.interfaces;

/**
 * The Interface Command.
 *
 * @param <T> the generic type
 */
public interface Command<T extends CommandEnum>{
	
	/**
	 * Execute.
	 *
	 * @param commandEnum the command enum
	 */
	public void execute(T commandEnum);
	
	
}