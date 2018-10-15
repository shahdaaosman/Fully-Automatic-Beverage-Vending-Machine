package edu.bu.met.cs665.BeverageMachine;

import edu.bu.met.cs665.behaviors.BrewEspresso;
import edu.bu.met.cs665.behaviors.BrewNothing;
import edu.bu.met.cs665.behaviors.BrewWater;

//This class represents Americano coffee
public class Americano extends Beverage{

	public Americano() {
		super();
		// TODO Auto-generated constructor stub
	    this.setName("Americano");
	    this.setPrice(4.00);
		this.brewBehavior = new BrewEspresso();
		this.brewBehavior2 = new BrewWater();
		this.brewBehavior3 = new BrewNothing();


	}


}
