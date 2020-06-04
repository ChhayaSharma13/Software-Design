package Toppings;

import Decorator.ToppingsDecorator;
import Factory.Burger;

public class Mushrooms extends ToppingsDecorator{	
	private Burger burger;
	public Mushrooms(Burger burger) {
		this.burger=burger;
	}
	@Override
	public String getDescription() {
		return burger.getDescription() + "Mushrooms, ";
	}
	@Override
	public double getCost() {
		return 1.75 + burger.getCost();
	}
	
}
