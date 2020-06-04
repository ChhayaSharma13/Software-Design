package Toppings;

import Decorator.ToppingsDecorator;
import Factory.Burger;

public class Hamburger extends ToppingsDecorator{
	private Burger burger;
	public Hamburger(Burger burger) {
		this.burger=burger;
	}
	@Override
	public String getDescription() {
		return burger.getDescription() + "hamburger, ";
	}
	@Override
	public double getCost() {
		return 2.0 + burger.getCost();
	}	
}
