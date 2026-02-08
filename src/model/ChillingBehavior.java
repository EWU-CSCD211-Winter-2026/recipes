package model;

public class ChillingBehavior implements IBehavior {
	
	private int chillingTime;

	public ChillingBehavior(int chillingTime) {
		this.chillingTime = chillingTime;
	}
	
	public int getChillingTime() {
		return chillingTime;
	}

	@Override
	public void recipeBehavior(Recipe r) {
		System.out.println("Chilling recipe [" + r.format('|') + "] for " + getChillingTime() +  " minutes.");
	}

}
