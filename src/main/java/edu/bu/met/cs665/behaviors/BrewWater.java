package edu.bu.met.cs665.behaviors;

//This class represents Brew Water Behavior
public class BrewWater implements BrewBehavior {

	//initial state of the valve (closed)
	private Boolean waterValve = false;

	@Override
	public void brew() {
		// This open the water valve
		waterValve = true;
		try {
			System.out.println("\n Water valve is open");
			// wait 2 sec
			Thread.sleep(2000);
			System.out.println("\n Water valve is closed");
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		// The Steamed water valve closed
		waterValve = false;
	}

}
