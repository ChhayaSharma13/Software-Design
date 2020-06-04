
public class HNode {
	int key;
	Medicine medicine;
	HNode next;
	public HNode(int key, Medicine medicine, HNode next) {
		super();
		this.key = key;
		this.medicine = medicine;
		this.next = next;
	}
	
	public int readKey() {
		return key;
	}
	public String readMedicine() {
		return medicine.toString();
	}
	
}
