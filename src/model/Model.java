package model;

import gameLogic.GameState;

import java.util.ArrayList;

import model.manager.CelestialObjectManager;
import model.manager.Manager;
import model.manager.NavigationManager;
import controller.Controller;
import controller.command.ChatCommand;

/*
 * Model.class
 * 
 * PURPOSE:
 * -Nexus between controller and view
 * -holds game loop (timedExecutor) 
 * 		>uses this to call manageManagers to manage game state
 */

public class Model {
	
	TimedExecutor modelLoop;
	public static GameState theGame;

	private Controller myController;
	private ArrayList<Manager> managers;
	
	CelestialObjectManager celestObjMgr;
	NavigationManager navigationManager;
	
	public Model() {
		// TODO Auto-generated constructor stub
		modelLoop = new TimedExecutor(this);
		theGame = new GameState();
		
		managers = new ArrayList<Manager>();
		celestObjMgr = new CelestialObjectManager(theGame);
		managers.add(celestObjMgr);
		
		navigationManager = new NavigationManager(theGame);
		managers.add(navigationManager);
		
		celestObjMgr.createGalaxy();
		
		
		//modelLoop.start();
		
		
	}
	
	/*
	 * setController(Controller myController)
	 * 
	 * hooks up our controller to model
	 */
	public void setController(Controller myController) {
		this.myController = myController;
	}
	
	/*
	 * manageManagers()
	 * 
	 * PURPOSE:
	 * Tell each manager to do it's operations per frame
	 * 
	 * THIS CALLS: 
	 * manage method on each manager in the manager list
	 * 
	 * CALLED BY: 
	 * TimedExecutor for each game frame (ex 60fps)
	 */
	public void manageManagers() {
		for (Manager manager : managers) {
			manager.manage();
		}
	}

	/*
	 * receiveCommand(ChatCommand cmd)
	 * 
	 * PURPOSE:
	 * Receive ChatCommand objects from controller
	 * 
	 * THIS CALLS:
	 * Managers depending on switch statement
	 * 
	 * CALLED BY:
	 * Controller
	 * 
	 */
	public void receiveCommand(ChatCommand cmd) {
		// TODO Auto-generated method stub
		System.out.println("Model.receiveCommand: " + cmd.getClass().toString());
		
		switch (cmd.getMyEnum()) {

		case BUILD:
			//buildManager.executeCommand(cmd);
			break;
		case GENERAL:
			// general use testing enum
			break;
		case PLANET:
			celestObjMgr.addPlanet();
			break;
		case NAVIGATE: // specify navigation
			System.out.println("Navigate in case statement");
			navigationManager.moveShipToNext();
			break;
		case YES1:
		case YES2:
		case NO1:
		case NO2:
			break;
		case MENU:
			break;
		default:
			break;
		}
	}
	
	



	
}
