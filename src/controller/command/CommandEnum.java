package controller.command;

/*
 * CommandEnum:
 * 
 * PURPOSE: Holds all possible prefixes and their associated
 * 			ChatCommand classes.
 * 
 * USE: If you need a new type of command just give it a prefix
 * and it's associated ChatCommand class.
 * 
 */

public enum CommandEnum {

	/*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
	/*~~~~~~~~~Defined Enums~~~~~~~~~*/
	/*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
	BUILD ("b:", BuildCommand.class),
	GENERAL ("g:", GenericCommand.class),
	NAVIGATE ("navigate", NavigateCommand.class),
	YES1 ("y ", BooleanCommand.class),
	YES2 ("yes", BooleanCommand.class),
	NO1 ("n ", BooleanCommand.class),
	NO2 ("no", BooleanCommand.class),
	MENU ("menu", MenuCommand.class),
	PLANET ("p:", PlanetCommand.class);
	
	
	/*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
	/*~~~~~~~~~~Enum methods~~~~~~~~~*/
	/*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
	
	private final String prefix;
	private final Class<?> myClass;
	
	CommandEnum(String prefix, Class<?> myClass) {
		this.prefix = prefix;
		this.myClass = myClass;
	}
	
	public String getPrefix() {
		return this.prefix;
	}
	
	public Class<?> getMyClass() {
		return myClass;
	}
}
