package gameLogic;

import java.util.ArrayList;

abstract class Star {
	protected String name;
	protected int size;
	protected ArrayList<Planet> solarSystem = new ArrayList<Planet>();
	
	abstract public ArrayList<Planet> getSolarSystem(int size, String name);
	abstract public Star makeStar(int size);
}
