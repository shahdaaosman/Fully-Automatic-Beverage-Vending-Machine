package edu.bu.met.cs665.behaviors;

//This class represents Brew Milk Behavior
public class BrewMilk implements BrewBehavior {

	// initial state of the valve (closed)
	private Boolean milkValve = false;

	@Override
	public void brew() {
		// This open the Steamed milk valve
		milkValve = true;
		try {
			System.out.println("\n milk valve is open");
			// wait  1 second
			Thread.sleep(1000);
			System.out.println("\n milk valve is closed");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// The Steamed milk valve closed
		milkValve = false;
	}

}
