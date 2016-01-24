package model.manager;

import controller.command.ChatCommand;
import gameLogic.GameState;
import gameLogic.Star;

public class NavigationManager extends Manager {

	public NavigationManager(GameState myGame) {
		super(myGame);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void manage() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void receiveCommand(ChatCommand cmd) {
		// TODO Auto-generated method stub
		
	}
	
	public void moveShip(Star destination) {
		
		if (myGame.currentMothershipLocation != null){
			System.out.println("NavigationManager moving ship from " + myGame.currentMothershipLocation.getName() + " to " + destination.getName());
		}
		myGame.currentMothershipLocation = destination;
	}

	public void moveShipToNext() {
		if (myGame.currentMothershipLocation != null){
			System.out.print("NavigationManager moving ship from " + myGame.currentMothershipLocation.getName() + " to next star");
		}
		else {
			System.out.print("Initial navigation to");
		}
		myGame.currentMothershipLocation = myGame.galaxy.get(myGame.galaxy.indexOf(myGame.currentMothershipLocation) + 1);
		System.out.println(": " + myGame.currentMothershipLocation.getName());
	}
	
	

}
