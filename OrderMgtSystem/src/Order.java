import java.io.Serializable;

public class Order implements Serializable{
	int orderId;
	String mobileNo;
	 Date date;
	 Time time;
	 String address;
	String itemName;
	boolean status;
	String customerName;
	
	Order(){
		
	}
	 public Order(int orderId,String itemName, String customerName, String mobileNo, Date date, Time time, String address) {
		super();
		this.orderId = orderId;
		this.itemName = itemName;
		this.customerName = customerName;
		this.mobileNo = mobileNo;
		this.date = date;
		this.time = time;
		this.address = address;
		this.status = false;		
	}
	 
	void setStatus() {
		this.status = true;
	}
	
	
	 public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Time getTime() {
		return time;
	}
	public void setTime(Time time) {
		this.time = time;
	}      
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", mobileNo=" + mobileNo + "\n date=" + date + ", time=" + time
				+ "\n address=" + address + ", itemName=" + itemName + "\n status=" + status + ", customerName="
				+ customerName + "]";
	}

	
	
	 
}
