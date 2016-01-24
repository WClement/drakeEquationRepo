package controller.command;

import controller.Controller;
import controller.command.CommandEnum;
import controller.command.CommandFactory;

public class CommandParser {

	CommandFactory cmdFactory;
	Controller myController;
	
	public CommandParser(Controller myController) {
		this.myController = myController;
		cmdFactory = new CommandFactory();
	}
	
	/*
	 * parseForCommand():
	 * 
	 * Checks through CommandEnums for prefixes to determine a
	 * properly formed command
	 * 
	 * If a command is found it passes in the prefix and the command's
	 * associated ChatCommand class
	 */
	
	public void parseForCommand(String raw) {
		raw = raw.toLowerCase();
		for (CommandEnum e : CommandEnum.values())
			if (raw.startsWith(e.getPrefix())) {
				myController.sendCommand(cmdFactory.createCommand(raw.substring(e.getPrefix().length()), e,  e.getMyClass()));
			}
	}
}
