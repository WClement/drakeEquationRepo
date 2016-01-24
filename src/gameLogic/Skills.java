package gameLogic;

public abstract class Skills {
	
	private ResearchType type;
	private boolean purchased;
	private boolean active;
	private boolean passive;
	private ResourceArrayWrapper cost = new ResourceArrayWrapper();
	
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
		this.setPassive(!active);
	}
	public boolean isPassive() {
		return passive;
	}
	public void setPassive(boolean passive) {
		this.passive = passive;
		this.active = !passive;
	}
	public boolean isPurchased() {
		return purchased;
	}
	public void setPurchased(boolean purchased) {
		this.purchased = purchased;
	}
	public ResearchType getType() {
		return type;
	}
	public void setType(ResearchType type) {
		this.type = type;
	}
	
}
