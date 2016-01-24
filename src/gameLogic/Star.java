package gameLogic;

import java.util.ArrayList;

public class Star {
	private String name;
	private int size;
	private ArrayList<Planet> solarSystem = new ArrayList<Planet>();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public ArrayList<Planet> getSolarSystem() {
		return solarSystem;
	}
	public void setSolarSystem(ArrayList<Planet> solarSystem) {
		this.solarSystem = solarSystem;
	}
}
