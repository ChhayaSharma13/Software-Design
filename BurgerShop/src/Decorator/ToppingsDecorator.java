package Decorator;

import Factory.Burger;
public abstract class ToppingsDecorator extends Burger {
	public abstract String getDescription();
	public abstract double getCost();
}
