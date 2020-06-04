package Factory;

public abstract class Burger {
	
	protected String description="Unknown Burger";
	protected double Cost=0.0;
	
	public double getCost() {
		return Cost;
	}
	public void setCost(double cost) {
		Cost = cost;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
