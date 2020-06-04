package burger;

import Factory.Burger;

public class LargeSizeBurger extends Burger{
	
	public LargeSizeBurger()
	{
		
		description="Large with ";
	}
	@Override
	public double getCost() {                                 		
		return 12;
	}


}
