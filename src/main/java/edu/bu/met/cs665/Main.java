package edu.bu.met.cs665;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import edu.bu.met.cs665.BeverageMachine.Americano;
import edu.bu.met.cs665.BeverageMachine.Beverage;
import edu.bu.met.cs665.BeverageMachine.BlackTea;
import edu.bu.met.cs665.BeverageMachine.Espresso;
import edu.bu.met.cs665.BeverageMachine.GreenTea;
import edu.bu.met.cs665.BeverageMachine.LatteMacchiato;
import edu.bu.met.cs665.BeverageMachine.YellowTea;

public class Main {

	public static void main(String[] args) {

		while (true) {
			//Display Menu
			System.out.println(" What Do you would Like to Drink ?\n");
			System.out.println(" Coffee ----------------------------");
			System.out.println(" ( 1 ) Espresso--------------- $3.00");
			System.out.println(" ( 2 ) Americano-------------- $4.00");
			System.out.println(" ( 3 ) Latte Macchiato-------- $5.50");
			System.out.println(" Tea -------------------------------");
			System.out.println(" ( 4 ) Black Tea-------------- $2.00");
			System.out.println(" ( 5 ) Green Tee ------------- $2.50");
			System.out.println(" ( 6 ) Yellow Tea------------- $1.90");
			System.out.println(" Extra milk /Unit ------------ $0.20");
			System.out.println(" Suger /unit ----------------- $0.10");
			System.out.println("\n Please Enter an Item number from the Menu :");

			Scanner keyboard = new Scanner(System.in);
			while (true) {
                //Get the user choice
				int item = keyboard.nextInt();

				if (item == 1) {

					Beverage espresso = new Espresso();
					prepareBeverage(espresso);

					break;
				} else if (item == 2) {
					Beverage americano = new Americano();
					prepareBeverage(americano);

					break;

				} else if (item == 3) {
					Beverage latteMacchiato = new LatteMacchiato();
					prepareBeverage(latteMacchiato);
					break;

				} else if (item == 4) {
					Beverage blackTea = new BlackTea();
					prepareBeverage(blackTea);
					break;

				} else if (item == 5) {
					Beverage greenTea = new GreenTea();
					prepareBeverage(greenTea);
					break;

				} else if (item == 6) {
					Beverage yellowTea = new YellowTea();
					prepareBeverage(yellowTea);
					break;

				} else {
					System.out.println("Invalid number , Please Try again");
					continue;
				}
			}

		}
	}

	private static void prepareBeverage(Beverage beverageName) {
		/*
		 * This method represents the beverage creation process
		 */
		Scanner keyboard = new Scanner(System.in);
		// TODO Auto-generated method stub
		beverageName.brewBaverage();
		// Ask the user if he want an add Milk to the drink
		int milkUnit = beverageName.addExtraMilk();
		//calculate adding milk price
		double milkPrice = 0.20 * milkUnit;
		// Ask the user if he want an add Sugar to the drink
		int sugarUnit = beverageName.addSugar();
		//calculate adding sugar price
		double SugarPrice = 0.10 * sugarUnit;
		//Get the drink price
		double drinkPrice = beverageName.getPrice();
		//Get the total cost
		double totalDrinkPrice = calculateTotal(drinkPrice, milkPrice, SugarPrice);
		String drinkName = beverageName.getName();
		System.out.println("Your " + drinkName + " is Ready Enjoy ^_^\n\n");

	}

	private static double calculateTotal(double drinkPrice, double milkPrice, double sugarPrice) {
		/*
		 * This method Do the financial process
		 */
		double totalDrinkPrice = drinkPrice + milkPrice + sugarPrice;
		System.out.println("\n Your drink cost $" + String.format("%.2f", totalDrinkPrice));
		pay(totalDrinkPrice);

		return totalDrinkPrice;
	}

	private static void pay(double totalDrinkPrice) {
		/*
		 * This method ask the user to pay for the drink
		 */
		Scanner keyboard = new Scanner(System.in);
		
		while (true) {

			System.out.println(" Please Enter money to pay :");
			double money = keyboard.nextDouble();
			if (money >= totalDrinkPrice) {

				double change = money - totalDrinkPrice;
				System.out.println("Your change is $" + String.format("%.2f", change));

				break;
			} else {
				System.out.println("You didn't Enter enough money please Try again!");
				continue;
			}
		}
	}

}