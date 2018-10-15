package edu.bu.met.cs665.BeverageMachine;

import edu.bu.met.cs665.behaviors.BrewNothing;
import edu.bu.met.cs665.behaviors.BrewWater;

//This class represents Black Tea
public class BlackTea extends Beverage {

	public BlackTea() {
		super();
		this.setName("Black Tea");
		this.setPrice(2.00);
		this.brewBehavior = new BrewWater();
		this.brewBehavior2 = new BrewNothing();
		this.brewBehavior3 = new BrewNothing();
		addBlackTeaBag();

	}

	private void addBlackTeaBag() {

		System.out.println("\n Drop one Black Tea bag in the cup");
	}

}
