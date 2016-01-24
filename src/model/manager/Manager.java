package model.manager;

import controller.command.ChatCommand;
import gameLogic.GameState;

public abstract class Manager {

	private GameState myGame;
	
	
	public Manager(GameState myGame) {
		this.myGame = myGame;
	}
	
	public abstract void manage();
	
	public abstract void receiveCommand(ChatCommand cmd);
	
}
