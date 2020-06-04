import java.io.Serializable;

public class Date  implements Serializable {
	private String date,month,year;
	public Date(String d, String m, String y) {
		this.date=d;
		this.month=m;
		this.year=y;
	}
	public String toString(){
 		return " "+date+"/"+month+"/"+year;
 	}
 	public void reset(String d,String m,String y){
 		this.date=d;
		this.month=m;
		this.year=y;
		}
 	}