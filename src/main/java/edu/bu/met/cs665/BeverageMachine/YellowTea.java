package edu.bu.met.cs665.BeverageMachine;

import edu.bu.met.cs665.behaviors.BrewNothing;
import edu.bu.met.cs665.behaviors.BrewWater;

//This class Yellow Tea Green Tea
public class YellowTea extends Beverage {

	public YellowTea() {
		super();
		this.setName("Yellow Tea");
		this.setPrice(1.90);
		this.brewBehavior = new BrewWater();
		this.brewBehavior2 = new BrewNothing();
		this.brewBehavior3 = new BrewNothing();
		addYellowTeaBag();

	}

	private void addYellowTeaBag() {
		System.out.println("\n Drop one Yellow Tea bag in the cup");
	}

}
