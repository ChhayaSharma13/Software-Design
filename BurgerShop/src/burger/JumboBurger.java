package burger;

import Factory.Burger;

public class JumboBurger extends Burger{
		public JumboBurger()
	{
		description="Jumbo with ";
	}
	@Override
	public double getCost() {                           
		
		return 15;
	}
}
