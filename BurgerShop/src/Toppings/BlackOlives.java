package Toppings;

import Decorator.ToppingsDecorator;
import Factory.Burger;


public class BlackOlives extends ToppingsDecorator{
	private Burger burger;
	public BlackOlives(Burger burger) {
		this.burger=burger;
	}
	@Override
	public String getDescription() {
		return burger.getDescription() + "Black Olives, ";
	}
	@Override
	public double getCost() {
		return 1.50 + burger.getCost();
	}
}
