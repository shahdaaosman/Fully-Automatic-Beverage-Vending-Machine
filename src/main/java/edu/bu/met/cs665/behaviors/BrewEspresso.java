package edu.bu.met.cs665.behaviors;

//This class represents Brew Espresso Behavior
public class BrewEspresso implements BrewBehavior {

	//initial state of the valve (closed)
	private Boolean espressoValve = false;

	@Override
	public void brew() {
		espressoValve = true;
		try {
			System.out.println("\n Espresso valve is open");
			// wait
			Thread.sleep(2000);
			System.out.println("\n Espresso valve is closed");
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
		espressoValve = false;

	}

}
