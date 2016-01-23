package model;

import java.util.ArrayList;

import model.manager.Manager;
import controller.Controller;

public class Model {
	
	TimedExecutor modelLoop;

	private Controller myController;
	private ArrayList<Manager> managers;
	
	
	public Model() {
		// TODO Auto-generated constructor stub
		modelLoop = new TimedExecutor(this);
		//modelLoop.start();
	}
	
	public void setController(Controller myController) {
		this.myController = myController;
	}
	
	



	
}
