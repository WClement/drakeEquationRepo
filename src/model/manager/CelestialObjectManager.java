package model.manager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;

import controller.command.ChatCommand;
import controller.command.PlanetCommand;
import gameLogic.Atmosphere;
import gameLogic.Elements2000K;
import gameLogic.GameState;
import gameLogic.Planet;
import gameLogic.PlanetFactory;
import gameLogic.Star;
import gameLogic.StarFactory;

public class CelestialObjectManager extends Manager {

	private PlanetFactory planetFactory;
	private StarFactory starFactory = new StarFactory();
	/*
	 * PlanetManager()
	 * 
	 * All managers hold a ref to the gameState
	 * managers will update the gameState
	 */
	public CelestialObjectManager(GameState myGame) {
		super(myGame);
		// TODO Auto-generated constructor stub
	}

	
	public void manage() {
		// TODO Auto-generated method stub
	}
	
	public void addStar() {
		System.out.println("CelestialObjectManager: addStar() called");
	}
	
	public void addPlanet(){
		//myGame.addPlanet(planetFactory.newPlanet(INFO))
		System.out.println("CelestialObjectManager: addPlanet() called");
	}
	
	public void createGalaxy() {
		ArrayList<StarNames> galaxy = new ArrayList<StarNames>(EnumSet.allOf(StarNames.class));
		Collections.shuffle(galaxy);
		int rand;
		double random;
		for(StarNames names : galaxy){
			random = Math.random();
			rand = (int)(random * 101);
			if(rand < 10){
				rand = 10;
			}
			starFactory.theStar(rand, names.toString());
		}
	}


	@Override
	public void receiveCommand(ChatCommand cmd) {
		// TODO Auto-generated method stub
		if (cmd.getClass() == PlanetCommand.class) {
			addPlanet();
		}
	}
}
