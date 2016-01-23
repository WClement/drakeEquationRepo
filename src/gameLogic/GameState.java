package gameLogic;

import java.io.File;
import java.util.ArrayList;


/*
 * GameState.class
 * 
 * PURPOSE:
 * contains all game data
 * can create file to save state
 */

public class GameState {

	public File currentSaveFile;
	
	public ArrayList<Planet> planets;

	
	public void addPlanet(Planet toAdd) {
		planets.add(toAdd);
	}
	
	//List of systems
	// list of stars
	// player faction object
	// ai faction objects
	
}
