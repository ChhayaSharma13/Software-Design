import java.io.Serializable;

public class Medicine implements Serializable {

	String name;
	String disease;
	Date date;
	double price;
	int stock;
	public Medicine(String name, String disease, Date date, double price, int stock) {
		super();
		this.name = name;
		this.disease = disease;
		this.date = date;
		this.price = price;
		this.stock = stock;
	}
	@Override
	public String toString() {
		return "Medicine [name=" + name + ", disease=" + disease + ", date=" + date + ", price=" + price
				+ ", stock=" + stock + "]";
	}
	
	
}
