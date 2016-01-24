package controller;

import java.util.Scanner;

import controller.command.ChatCommand;
import controller.command.CommandParser;
import model.Model;

public class Controller implements Runnable {

	private Thread t;
	private String threadName = "ContThread";
	
	private Model myModel;
	private CommandParser cmdParser;
	Scanner in;
	
	public void setModel(Model myModel) {
		this.myModel = myModel;
	}

	public Controller() {
		in = new Scanner(System.in);
		cmdParser = new CommandParser(this);
	}

	public void start() {
		System.out.println("Starting controller");
		if (t == null) {
			t = new Thread(this, threadName);
			t.start();
		}
	}
	
	@Override
	public void run() {
		while(true) {
			String cmd = in.nextLine();
			System.out.println(cmd);
			cmdParser.parseForCommand(cmd);
		}
	}

	public void sendCommand(ChatCommand commandToSend) {
		// TODO Auto-generated method stub
		System.out.println("sendCommand: " + commandToSend.getSuffix());
		myModel.receiveCommand(commandToSend);
	}

	
	
	
	/*
	 * public void sendCommand(Command toSend) {
	 * 
	 * 		myModel.receiveCommand(toSend);
	 * 
	 * }
	 * 
	 */
}
