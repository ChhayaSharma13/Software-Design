package burger;

import Factory.Burger;

public class MediumSizeBurger extends Burger{
	public MediumSizeBurger()
	{
		description="Medium with ";
	}
	@Override
	public double getCost() {                               
		return 8;
	}
}
