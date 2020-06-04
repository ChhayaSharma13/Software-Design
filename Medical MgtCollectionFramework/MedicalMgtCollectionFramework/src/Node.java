
public class Node {
	int key;
	Medicine medicine;
	
	Node left;
	Node right;
	public Node(int key, Medicine medicine, Node left, Node right) {
		super();
		this.key = key;
		this.medicine = medicine;
		this.left = left;
		this.right = right;
	}
	
	public int readKey() {
		return key;
	}
	public String readMedicine() {
		return medicine.toString();
	}
}
