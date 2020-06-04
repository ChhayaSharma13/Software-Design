import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class MyArrayList{
        private Order[] head;
        private int max;
        private int count;
	  public  MyArrayList(int max){
	    	 this.max=max;
	    	 count=0;
	    	 head=new Order[max];}
        public  boolean insert(int orderId,String itemName, String customerName, String mobileNo, Date date, Time time, String address) throws IOException
	        {      if (count<max){
	        	        Order temp =new Order(orderId,itemName, customerName, mobileNo, date, time, address);
	                    head[count]=temp;
	                    count++;
	                    writeToFile(temp);
	                    return true;}
	               else  return false;
	        }	
        
	public Order getElement(int i){
    	   if (i<head.length)return head[i];
    	   else return head[head.length-1];
       }
       
       public Order getOrdersByName(String itemName){
    	   for(int i=0;i<count;i++) {
    		    if(head[i].getItemName().equals(itemName)) {
    		    	return head[i];
    		    }
    	   }
    	   return null;
    	 
       }
	public void updateStatus(int id) {
		// TODO Auto-generated method stub
		 for(int i=0;i<count;i++) {
 		    if(head[i].getOrderId() == id) {
 		    	System.out.println(head[i]);
 		    	head[i].setStatus();	    	
 		    }
 	    }
	}
	
	private void writeToFile(Order temp) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream f = new FileOutputStream(new File("order.txt"));
		ObjectOutputStream o = new ObjectOutputStream(f);
		o.writeObject(temp);
		o.close();
		f.close();
	}
	
	public void readFromFile() throws FileNotFoundException {
		FileInputStream fis = new FileInputStream("order.txt");
		boolean cont = true;
		try{
		   ObjectInputStream input = new ObjectInputStream(fis);
		   while(cont){
		      Object obj = input.readObject();
		      if(obj != null) {
		    	 System.out.println(obj.toString());
		      }
		      else
		    	  cont = false;
		   }
		}catch(Exception e){
		   //System.out.println(e.printStackTrace());
		}

	}
}