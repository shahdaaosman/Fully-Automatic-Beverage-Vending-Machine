package edu.bu.met.cs665.BeverageMachine;

import edu.bu.met.cs665.behaviors.BrewNothing;
import edu.bu.met.cs665.behaviors.BrewWater;

//This class represents Green Tea
public class GreenTea extends Beverage {

	public GreenTea() {
		super();
		// TODO Auto-generated constructor stub
		this.setName("Green Tea");
		this.setPrice(2.50);
		this.brewBehavior = new BrewWater();
		this.brewBehavior2 = new BrewNothing();
		this.brewBehavior3 = new BrewNothing();
		addGreenTeaBag();

	}

	private void addGreenTeaBag() {
		// TODO Auto-generated method stub
		System.out.println("\n Drop one Green Tea bag in the cup");
	}

}
