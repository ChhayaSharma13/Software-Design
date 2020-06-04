package Toppings;

import Decorator.ToppingsDecorator;
import Factory.Burger;
public class Anchovies extends ToppingsDecorator{
	Burger burger;
	public Anchovies(Burger burger) {
		this.burger=burger;
	}
	@Override
	public String getDescription() {
		return burger.getDescription() + "Anchovies, ";
	}
	@Override
	public double getCost() {
		return 0 + burger.getCost();
	}	
}
