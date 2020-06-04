package Toppings;

import Decorator.ToppingsDecorator;
import Factory.Burger;
public class Onions extends ToppingsDecorator{
	
	private Burger burger;

	public Onions(Burger burger) {
		this.burger=burger;
	}
	@Override
	public String getDescription() {
		return burger.getDescription() + "onions, ";
	}
	@Override
	public double getCost() {
		return 1.50 + burger.getCost();
	}
}
