package br.com.ignisinventum.infra.patters.behavioral.command.interfaces;

/**
 * The Interface Command.
 */
public interface Command<T extends CommandEnum>{
	
	/**
	 * Execute.
	 */
	public void execute(T commandEnum);
	
	
}