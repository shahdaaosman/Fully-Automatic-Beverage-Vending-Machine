package edu.bu.met.cs665.BeverageMachine;

import java.util.Scanner;

import edu.bu.met.cs665.behaviors.BrewBehavior;
import edu.bu.met.cs665.behaviors.BrewMilk;

//This class represents All Beverages
public class Beverage {

	// initial name for a beverage
	protected String name = "New Beverage";
	// initial price for a beverage
	protected double price;
	protected BrewBehavior brewBehavior;
	protected BrewBehavior brewBehavior2;
	protected BrewBehavior brewBehavior3;

	public void brewBaverage() {
		/*
		 * This method represents the brew function
		 */
		brewBehavior.brew();
		brewBehavior2.brew();
		brewBehavior3.brew();

	}

	Scanner keyboard = new Scanner(System.in);

	public int addSugar() {
		/*
		 * This method add sugar unit to the drink 
		 * and return the number of units
		 */
		System.out.println("\n Do you want an Extra Sugar ? Yes (1) : No (0) ");

		while (true) {

			int sugar = keyboard.nextInt();

			if (sugar == 1) {
				System.out.println("How many Unit of Sugar Do you want?");
				while (true) {
					System.out.println("---- Maximum Sugur Units is 3 ---- ");
					int sugarUnits = keyboard.nextInt();
					if (sugarUnits > 0 && sugarUnits < 4) {
						System.out.println(" " + sugarUnits + " Sugar Unit is added to your Drink");
						return sugarUnits;
					} else {
						System.out.println("Invalid Unit number Plese try again");
						continue;
					}
				}

			}

			else if (sugar == 0) {
				return 0;

			} else {
				System.out.println("Invalid choise (sugar units) , Please Try again");
				continue;
			}
		}
	}

	public int addExtraMilk() {
		/*
		 * This method add milk unit to the drink 
		 * and return the number of units
		 */
		System.out.println("\n Do you want an Extra Milk ? Yes (1) : No (0) ");
		while (true) {

			int milk = keyboard.nextInt();

			if (milk == 1) {

				System.out.println("How many Unit of Milk Do you want?");
				while (true) {
					System.out.println("---- Maximum Milk Units is 3 ---- ");
					int milkUnits = keyboard.nextInt();
					if (milkUnits > 0 && milkUnits < 4) {
						System.out.println(" " + milkUnits + " Milk Unit is added to your Drink");
						for (int i = 0; i < milkUnits; i++) {
							brewBehavior = new BrewMilk();
							brewBehavior.brew();
						}
						return milkUnits;
					} else {
						System.out.println("Invalid Unit number Plese try again");
						continue;
					}
				}
			} else if (milk == 0) {
				// code
				return 0;

			} else {
				System.out.println("Invalid choise (milk units), Please Try again");
				continue;
			}
		}
	}
    //Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double d) {
		this.price = d;
	}

	public BrewBehavior getBrewBehavior() {
		return brewBehavior;
	}

	public void setBrewBehavior(BrewBehavior brewBehavior) {
		this.brewBehavior = brewBehavior;
	}

	public BrewBehavior getBrewBehavior2() {
		return brewBehavior2;
	}

	public void setBrewBehavior2(BrewBehavior brewBehavior2) {
		this.brewBehavior2 = brewBehavior2;
	}

	public BrewBehavior getBrewBehavior3() {
		return brewBehavior3;
	}

	public void setBrewBehavior3(BrewBehavior brewBehavior3) {
		this.brewBehavior3 = brewBehavior3;
	}

}
