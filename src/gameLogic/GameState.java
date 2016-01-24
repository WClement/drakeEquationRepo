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
	public ArrayList<Star> galaxy;
	public ArrayList<Track> tracks;
	
	public Star currentMothershipLocation;

	public GameState() {
		planets = new ArrayList<Planet>();
		galaxy = new ArrayList<Star>();
		tracks = new ArrayList<Track>();
	}
	
	
	public void addPlanet(Planet toAdd) {
		planets.add(toAdd);
	}
	
	Star prev;
	public void addStar(Star toAdd) {
		System.out.println("GameState(): adding star");
		galaxy.add(toAdd);
		if (prev != null) {
			Track toSet = new Track(prev, toAdd);
			tracks.add(toSet);
		}
		prev = toAdd;
	}
	
	//List of systems
	// list of stars
	// player faction object
	// ai faction objects
	
}
