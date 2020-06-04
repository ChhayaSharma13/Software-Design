public class HashTable {
	private  int count;
	public int hash(int id) {
		return (id % 20);
	}
	private HNode[] head = new HNode[20];
	
	public HashTable() {
		for(int i=0; i<20;i++) {
			head[i] = null;
		}
	}
	public int getCount() {
		return count;
	}
	public void insert(int k, Medicine med) {
		HNode temp = new HNode(k, med, null);
		int index = hash(k);
		temp.next = head[index];
		head[index] = temp;
	}
	public HNode search(int k) {
		count = 0;
		int index = hash(k);
		HNode temp = head[index];
		boolean found = false;
		while(temp != null && found == false) {
			count++;
			if(temp.key == k) {
				found = true;
				break;
			}
			temp = temp.next;
		}
		return temp;
	}
	public HNode update(int k, int q) {
		int index = hash(k);
		HNode temp = head[index];
		boolean found = false;
		while(temp != null && found == false) {
			if(temp.key == k) {
				 if( temp.medicine.stock < q) 
					 return null;
				 else 
					 temp.medicine.stock -= q;
				 found = true;
				 break;
			}
			temp = temp.next;
		}
		return temp;
	}
}
