package gameLogic;

public enum Resources {
	HYDROGEN("Hydrogen", 0), LITHIUM("Lithium", 1), CARBON("Carbon", 2), NITROGEN("Nitrogen", 3),
	OXYGEN("Oxygen", 4), C02("CO2", 5), WATER("Water", 6), ICE("Ice", 7), LIFE("Life", 8),
	METHANE("Methane", 9), MAGNESIUM("Magnesium", 10), SILICON("Silicon", 11),
	IRON("Iron", 12), URANIUM("Uranium", 13);
	
	private final String name;
	private final int ID;
	
	Resources(String name, int ID) {
		this.name = name;
		this.ID = ID;
	}

	public String getName() {
		return name;
	}

	public int getID() {
		return ID;
	}
}