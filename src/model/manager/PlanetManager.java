package model.manager;

import java.util.ArrayList;

import gameLogic.GameState;
import gameLogic.Planet;
import gameLogic.PlanetFactory;

public class PlanetManager extends Manager {

	private PlanetFactory planetFactory;
	
	/*
	 * PlanetManager()
	 * 
	 * All managers hold a ref to the gameState
	 * managers will update the gameState
	 */
	public PlanetManager(GameState myGame) {
		super(myGame);
		// TODO Auto-generated constructor stub
	}

	
	public void manage() {
		// TODO Auto-generated method stub
	}
	
	public void addPlanet() {
		//myGame.addPlanet(planetFactory.newPlanet(INFO))
	}
}
