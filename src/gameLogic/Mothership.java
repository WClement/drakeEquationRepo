package gameLogic;

import java.util.ArrayList;

public abstract class Mothership {
	
	private ResourceArrayWrapper resources = new ResourceArrayWrapper();
	private ArrayList<Planet> colonies = new ArrayList<Planet>();
	private int baseHealth;
	private int currentHealth;
	private int numDocks;
	private int numDockedShips;

	public ArrayList<Planet> getColonies() {
		return colonies;
	}

	public void setColonies(ArrayList<Planet> colonies) {
		this.colonies = colonies;
	}

	public ResourceArrayWrapper getResources() {
		return resources;
	}

	public void setResources(ResourceArrayWrapper resources) {
		this.resources = resources;
	}

}
