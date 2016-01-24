package model;

import gameLogic.GameState;

import java.util.ArrayList;

import model.manager.Manager;
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
	
	
	public Model() {
		// TODO Auto-generated constructor stub
		modelLoop = new TimedExecutor(this);
		//modelLoop.start();
	}
	
	/*
	 * setController()
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

	public void receiveCommand(ChatCommand cmd) {
		// TODO Auto-generated method stub
		System.out.println("Model received command: " + cmd.getSuffix());
		
		switch (cmd.getMyEnum()) {

		case BUILD:
			//buildManager.executeCommand(cmd);
			break;

		default:
			break;
		}
	}
	
	



	
}
