package Toppings;

import Decorator.ToppingsDecorator;
import Factory.Burger;

public class Beer extends ToppingsDecorator{
	private Burger burger;	
	public Beer(Burger burger) {
		this.burger=burger;
	}
	@Override
	public String getDescription() {
		return burger.getDescription() + "beer, ";
	}
	@Override
	public double getCost() {
		return 3.25 + burger.getCost();
	}
}
