package Factory;

public abstract class BurgerStore {
	
	protected abstract Burger createBurger(String item,Burger burger);
	public Burger orderBurger(String type, Burger burger)                  
	{
		burger = createBurger(type,burger);             
		return burger;
	}

}
