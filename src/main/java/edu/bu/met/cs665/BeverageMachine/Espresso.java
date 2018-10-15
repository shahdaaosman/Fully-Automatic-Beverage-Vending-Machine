package edu.bu.met.cs665.BeverageMachine;

import edu.bu.met.cs665.behaviors.BrewEspresso;
import edu.bu.met.cs665.behaviors.BrewNothing;

//This class represents Espresso coffee
public class Espresso extends Beverage {

	public Espresso( ) {
		super();
		// TODO Auto-generated constructor stub
	    this.setName("Espresso");
	    this.setPrice(3.00);
		this.brewBehavior = new BrewEspresso();
		this.brewBehavior2 = new BrewNothing();
		this.brewBehavior3 = new BrewNothing();



	}

}
