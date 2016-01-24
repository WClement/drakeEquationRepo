package controller.command;


public abstract class ChatCommand {
	
	// all commands have a reference to their receiver
	// through the superclass
	private String suffix;
	private CommandEnum myEnum;
	private int controllerId;
	
	public ChatCommand(String suffix, CommandEnum myEnum) {
		this.setMyEnum(myEnum);
		this.suffix = suffix;
		this.controllerId = controllerId;
	}
	
	public int getControllerId() {
		return controllerId;
	}
	
	public String getSuffix() {
		return suffix;
	}
	

	
	
	
	
	public void execute() {
	}

	public CommandEnum getMyEnum() {
		return myEnum;
	}

	public void setMyEnum(CommandEnum myEnum) {
		this.myEnum = myEnum;
	}

}
