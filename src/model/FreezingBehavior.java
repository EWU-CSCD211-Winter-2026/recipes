package model;

public class FreezingBehavior implements IBehavior {
	
	private int freezerTemp;

	public FreezingBehavior(int freezerTemp) {
		this.freezerTemp = freezerTemp;
	}
	
	public int getFreezerTemp() {
		return freezerTemp;
	}

	@Override
	public void recipeBehavior(Recipe r) {
		System.out.println("Freezing behavior recipe " + r.format('|') + " at " + getFreezerTemp() +  " degrees.");
	}

}
