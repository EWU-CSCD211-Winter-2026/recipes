package demo2.best;

public class BakingBehavior implements IBehavior {
	
	private int bakingTime;
	private int ovenTemp;

	public BakingBehavior(int bakingTime, int ovenTemp) {
		this.bakingTime = bakingTime;
		this.ovenTemp = ovenTemp;
	}
	
	public int getBakingTime() {
		return bakingTime;
	}
	
	public int getOvenTemp() {
		return ovenTemp;
	}

	@Override
	public void recipeBehavior(Recipe r) {
		System.out.println("Baking recipe [" + r.format('|') + "] for " + getBakingTime() + " minutes at " + getOvenTemp() + " degrees F");
	}

}
