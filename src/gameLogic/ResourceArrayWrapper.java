package gameLogic;

public class ResourceArrayWrapper {
	int[] resourceArray = new int[14];
	
	public void addResource(Resources rsc, int val) {
		resourceArray[rsc.getID()] += val;
	}
	
	public int getResource(Resources rsc) {
		return resourceArray[rsc.getID()];
	}
}
