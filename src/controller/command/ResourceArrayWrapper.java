package controller.command;

public class ResourceArrayWrapper {
	int[] resourceArray = new int[18];
	
	public void addGold(int toAdd) {
		resourceArray[3] += toAdd;
	}
}
