package burger;

import Factory.Burger;

public class SmallSizeBurger extends Burger {
	
	public SmallSizeBurger()
	{
		
		description="Small with ";
	}
	@Override
	public double getCost() {                                 
		
		return 5;
	}
}
