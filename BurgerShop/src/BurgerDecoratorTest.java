
import java.text.DecimalFormat;
import java.util.Scanner;

import Factory.Burger;

public class BurgerDecoratorTest {

	public static void main(String[] args) {

		myStore burger = new myStore();
		String finalOrder = null;
		DecimalFormat df = new DecimalFormat(".###");
		int ingredients = 0;
		double finalCost = 0.0;
		int firstChoice = 0;
		String choice = null;
		char secondChoice;
		Burger orderedBurger = null;
		
//		Showing main menu
		Scanner input = new Scanner(System.in);
		System.out.println("*****************Burger Menu***************");
		System.out.println("1. Small Burger, $5.00");
		System.out.println("2. Medium Burger, $8.00");
		System.out.println("3. Large Burger, $12.00");
		System.out.println("4. Jumbo Burger, $15.00");
		System.out.println("Enter the burger of your choice:");
		firstChoice = input.nextInt();
		
		switch (firstChoice) {
		case 1:
			orderedBurger = burger.orderBurger("Small Burger", orderedBurger);
			break;
		case 2:
			orderedBurger = burger.orderBurger("Medium Burger", orderedBurger);
			break;
		case 3:
			orderedBurger = burger.orderBurger("Large Burger", orderedBurger);
			break;
		case 4:
			orderedBurger = burger.orderBurger("Jumbo Burger", orderedBurger);
			break;
		default:
			System.out.println("Invalid choice. Please try again!!!");
			System.exit(0);
		}
//		Adding toping/stuffing
		do {
			System.out.println("\n********List of ingredients********");
			System.out.println("(a)nchovies, Free!");
			System.out.println("bee(r), $3.25");
			System.out.println("(b)lack olives, $1.50");
			System.out.println("(g)reen pepper, $1.50");
			System.out.println("(h)amburger, $2.00");
			System.out.println("(m)ushrooms, $1.75");
			System.out.println("(o)nions, $1.50");
			System.out.println("Press 'q' to see the Final Order and the Total Price. Press 'z' to cancel the order");
			System.out.println("Enter the ingredients of your choice: ");

			choice = input.next();
			secondChoice = choice.charAt(0);
//			adding desired toping
			switch (secondChoice) {
			case 'h':

				orderedBurger = burger.orderBurger("Hamburger", orderedBurger);
				ingredients = ingredients + 1;
				finalOrder = orderedBurger.getDescription();
				finalOrder = finalOrder.substring(0, finalOrder.length() - 2);
				finalCost = orderedBurger.getCost();

				System.out.println("Order: " + finalOrder + " - $" + df.format(finalCost));
				System.out.println(ingredients + " ingredients");
				break;
			
			case 'o':
				orderedBurger = burger.orderBurger("Onions", orderedBurger);
				ingredients = ingredients + 1;
				finalOrder = orderedBurger.getDescription();
				finalOrder = finalOrder.substring(0, finalOrder.length() - 2);
				finalCost = orderedBurger.getCost();
				System.out.println("Order: " + finalOrder + " - $" + df.format(finalCost));
				System.out.println(ingredients + " ingredients");
				break;
			
			case 'b':
				orderedBurger = burger.orderBurger("Black Olives", orderedBurger);
				ingredients = ingredients + 1;
				finalOrder = orderedBurger.getDescription();
				finalOrder = finalOrder.substring(0, finalOrder.length() - 2);
				finalCost = orderedBurger.getCost();
				System.out.println("Order: " + finalOrder + " - $" + df.format(finalCost));
				System.out.println(ingredients + " ingredients");
				break;

			case 'm':
				orderedBurger = burger.orderBurger("Mushrooms", orderedBurger);
				ingredients = ingredients + 1;
				finalOrder = orderedBurger.getDescription();
				finalOrder = finalOrder.substring(0, finalOrder.length() - 2);
				finalCost = orderedBurger.getCost();
				System.out.println("Order: " + finalOrder + " - $" + df.format(finalCost));
				System.out.println(ingredients + " ingredients");
				break;
				
			case 'a':
				orderedBurger = burger.orderBurger("Anchovies", orderedBurger);
				ingredients = ingredients + 1;
				finalOrder = orderedBurger.getDescription();
				finalOrder = finalOrder.substring(0, finalOrder.length() - 2);
				finalCost = orderedBurger.getCost();
				System.out.println("Order: " + finalOrder + " - $" + df.format(finalCost));
				System.out.println(ingredients + " ingredients");
				break;
			
			case 'r':
				orderedBurger = burger.orderBurger("Beer", orderedBurger);
				ingredients = ingredients + 1;
				finalOrder = orderedBurger.getDescription();
				finalOrder = finalOrder.substring(0, finalOrder.length() - 2);
				finalCost = orderedBurger.getCost();
				System.out.println("Order: " + finalOrder + " - $" + df.format(finalCost));
				System.out.println(ingredients + " ingredients");
				break;

			case 'g':
				orderedBurger = burger.orderBurger("Green Pepper", orderedBurger);
				ingredients = ingredients + 1;
				finalOrder = orderedBurger.getDescription();
				finalOrder = finalOrder.substring(0, finalOrder.length() - 2);
				finalCost = orderedBurger.getCost();

				System.out.println("Order: " + finalOrder + " - $" + df.format(finalCost));
				System.out.println(ingredients + " ingredients");

				break;

			case 'q': 
//				If customer wants to quit
				finalOrder = orderedBurger.getDescription();
				finalOrder = finalOrder.substring(0, finalOrder.length() - 2);
				finalCost = orderedBurger.getCost();
				System.out.println("Final Order: " + finalOrder + " - $" + df.format(finalCost));
				System.out.println(ingredients + " ingredients");
				System.out.println("End order");
				break;
//			To cancel the order
			case 'z':
				System.exit(0);
				break;
//			If wrong choice is entered
			default:
				System.out.println("Invalid Choice. Please try agian!!!");
				break;

			}

		} while (secondChoice != 'q');
	input.close();

	}

}
