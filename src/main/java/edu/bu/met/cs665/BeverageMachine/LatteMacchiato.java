package edu.bu.met.cs665.BeverageMachine;

import edu.bu.met.cs665.behaviors.BrewEspresso;
import edu.bu.met.cs665.behaviors.BrewMilk;
import edu.bu.met.cs665.behaviors.BrewMilkFoam;

//This class represents Latte Macchiato coffee
public class LatteMacchiato extends Beverage {

	public LatteMacchiato() {
		super();
		// TODO Auto-generated constructor stub
		this.setName("Latte Macchiato");
		this.setPrice(5.50);
		this.brewBehavior = new BrewEspresso();
		this.brewBehavior2 = new BrewMilk();
		this.brewBehavior3 = new BrewMilkFoam();

	}

}
