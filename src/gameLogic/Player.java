package gameLogic;

import java.util.ArrayList;

public abstract class Player {

	private ResourceArrayWrapper resources = new ResourceArrayWrapper();
	private ArrayList<Planet> colonies = new ArrayList<Planet>();
	
	public ResourceArrayWrapper getResources() {
		return resources;
	}
	
	public void setResources(ResourceArrayWrapper resources) {
		this.resources = resources;
	}
	
	public ArrayList<Planet> getColonies() {
		return colonies;
	}
	
	public void setColonies(ArrayList<Planet> colonies) {
		this.colonies = colonies;
	}
	
}
