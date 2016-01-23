package model.manager;

import gameLogic.GameState;

public abstract class Manager {

	private GameState myGame;
	
	
	public Manager(GameState myGame) {
		this.myGame = myGame;
	}
	
	public abstract void manage();
	
	
	
}
