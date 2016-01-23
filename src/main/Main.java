package main;

import model.Model;
import controller.Controller;

public class Main {

	// only need one of each of these
	public static  Controller theController;
	public static Model theModel;
	
	public static void main(String[] args) {
		
		// create instances of MVC
		theController = new Controller();
		theModel = new Model();
		
		// link up MVC
		theController.setModel(theModel);
		theModel.setController(theController);
	}
}
