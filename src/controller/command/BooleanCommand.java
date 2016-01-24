package controller.command;

public class BooleanCommand extends ChatCommand {

	boolean myBool;
	
	public BooleanCommand(String suffix, CommandEnum myEnum) {
		super(suffix, myEnum);
		// TODO Auto-generated constructor stub
		if (myEnum.getPrefix().startsWith("y")) {
			myBool = true;
		}
		else {
			myBool = false;
		}
	}

}
