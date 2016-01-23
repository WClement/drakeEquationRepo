package gameLogic;

import java.util.ArrayList;

public abstract class Player {
	
	private ResourceArrayWrapper resources = new ResourceArrayWrapper();
	private ArrayList<Planet> colonies = new ArrayList<Planet>();

	public ArrayList<Planet> getColonies() {
		return colonies;
	}

	public void setColonies(ArrayList<Planet> colonies) {
		this.colonies = colonies;
	}

}
