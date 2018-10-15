package edu.bu.met.cs665.behaviors;

//This class represents Brew Milk Foam Behavior
public class BrewMilkFoam implements BrewBehavior {

	//initial state of the valve (closed)
	private Boolean milkFoamValve = false;

	@Override
	public void brew() {
		// This open the milk foam valve
		milkFoamValve = true;
		try {
			System.out.println("\n milk foam valve is open");
			// wait  2 sec
			Thread.sleep(2000);
			System.out.println("\n milk foam valve is closed");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// The milk foam valve closed
		milkFoamValve = false;
	}

}
