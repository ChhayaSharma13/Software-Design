package Toppings;

import Decorator.ToppingsDecorator;
import Factory.Burger;
public class GreenPepper extends ToppingsDecorator{
	private Burger burger;
	public GreenPepper(Burger burger) {
		this.burger=burger;
	}
	
	@Override
	public String getDescription() {
		return burger.getDescription() + "Green Pepper, ";
	}

	@Override
	public double getCost() {
		return 1.50 + burger.getCost();
	}
}
