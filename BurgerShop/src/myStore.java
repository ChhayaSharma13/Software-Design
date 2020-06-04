import Factory.Burger;

import Factory.BurgerStore;
import Toppings.Anchovies;
import Toppings.Beer;
import Toppings.BlackOlives;


import Toppings.GreenPepper;
import Toppings.Hamburger;
import Toppings.Mushrooms;
import Toppings.Onions;
import burger.JumboBurger;
import burger.LargeSizeBurger;
import burger.MediumSizeBurger;
import burger.SmallSizeBurger;

public class myStore extends BurgerStore {
	@Override
	protected  Burger createBurger(String item,Burger burger) {
		
		if(item.equals("Small Burger"))
			//burger=new Burger();
			burger=new SmallSizeBurger();
	
		else if(item.equals("Medium Burger"))
			burger=new MediumSizeBurger();
		
		else if(item.equals("Large Burger"))
			burger=new LargeSizeBurger();
		
		else if(item.equals("Jumbo Burger"))
			burger=new JumboBurger();

		else if(item.equals("Hamburger"))
				burger=new Hamburger(burger);
		
		else if(item.equals("Onions"))
				burger=new Onions(burger);
		
		else if(item.equals("Black Olives"))
				burger=new BlackOlives(burger);
		
		else if(item.equals("Mushrooms"))
				burger=new Mushrooms(burger);
		
		else if(item.equals("Anchovies"))
				burger=new Anchovies(burger);
		
		else if(item.equals("Beer"))
				burger=new Beer(burger);
		
		else if(item.equals("Green Pepper"))
				burger=new GreenPepper(burger);
		
		return burger;
	}

}


