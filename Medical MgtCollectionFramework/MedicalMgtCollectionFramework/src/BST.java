
public class BST {
	private Node head;
	private Node tail;
	private int count;
	public BST() {
		this.tail = new Node(0, null, null, null);
		this.head = new Node(-1, null, null, tail);
	}
	
	public void insert(int k, Medicine medicine) {
		Node p, x;
		p= head;
		x = head.right;
		while(x!=tail) {
			p = x;
			x = (k < x.key) ? x.left : x.right ;
		}
		x = new Node(k , medicine, tail, tail);
		if(k < p.key) {
			p.left = x;
		}
		else {
			p.right = x;
		}
	}
	public int getCount() {
		return count;
	}
	
	public Node search(int k) {
		  count =0;
		  Node   x= head.right;
          tail.key=k;
          boolean found=false;
		  while (x!=tail && found==false){
			  count++;
			  if (k==x.key)	
				  found=true;
			  else if (k < x.key)		
				  x= x.left ;
              else
                  x= x.right;
		}
		if (x==tail)       return null;
    	else               return   x;
	}	
	
	public Node update(int k, int q) {
		Node x= head.right;
        tail.key=k;
        boolean found=false;
		  while (x!=tail && found==false){
			  if (k==x.key) {
				 if( x.medicine.stock < q) 
					 return null;
				 else 
					 x.medicine.stock -= q;
				 found=true;
			  }
			  else if (k < x.key)		
				  x= x.left ;
			  else
                x= x.right;
		}
		if (x==tail)       return null;
		else               return   x;
	}	
	
}
