public class Main {
	public static void main(String[] args) {
      String cname,sname;
      long cnum=0,snum=0;
		Customers c = new Customers("Saakshi",9000000000L,"Bangalore");
       c.displayProfileDetails("Saakshi",9000000000L,"Bangalore");
       Customers d = new Customers("Rahul",9000000001L,"Coimbatore");
       d.displayProfileDetails("Rahul",cnum,"Coimbatore");
       Suppliers t = new Suppliers("ABC Traders",8000000000L,"Mumbai",5);
       t.displayProfileDetalis("ABC Traders",8000000000L,"Mumbai",5);
       Suppliers s = new Suppliers("XYZ Enterprises",8000000900L,"Delhi",12);
       s.displayProfileDetalis("XYZ Enterprises",8000000900L,"Delhi",12);
       c.editAddress("Coimbatore");
       t.editAddress("Delhi" );
       c.placeOrder();
       t.increaseStockLevel("ABC Traders",10);
       s.increaseStockLevel("XYZ Enterprises",12);
}
}

class Users {
		//write the logic for the class Users	      
}
class Customers extends Users{
   String custname;
   long custnum;
   String cAdd ;
   public Customers(String cname,long cnum,String cAdd)
      {
       this.custname = cname;
        this.custnum = cnum;
        this.cAdd = cAdd;
   }
      public void increasestockLevel() {
	// TODO Auto-generated method stub
	
}
	public void increaseStockLevel(String string, int i) {
	// TODO Auto-generated method stub
	
}
	public void displayProfileDetails(String cname,long cnum,String cAdd)
      {
    System.out.println(custname+", "+custnum);   
      }
      public void editAddress(String nAdd)
      {
    	  System.out.println(custname+", "  +cAdd);
    	  System.out.println(custname+", "  +nAdd);
      }
      public void placeOrder()
      {
    	  System.out.println("Order placed successfully!");
      }
      
}
class Suppliers extends Users {
String stname;
  long stnum;
  String sAdd;
  int sstock;
  public Suppliers(String sname,long snum,String sAdd,int stock)
  {
    this.stname = sname;
    this.stnum = snum;
    this.sAdd = sAdd;
    this.sstock = stock;
}
  public Suppliers() {
	// TODO Auto-generated constructor stub
}
public void displayProfileDetalis(String sname,long snum,String sadd,int sstock)
  {
    System.out.println(stname+", "+stnum);
    //System.out.println("xyz Enterprises");
    
  }
public void editAddress(String eAdd)
{
	System.out.println(stname+", "+sAdd);
	System.out.println(stname+", "+eAdd);
}
public void increaseStockLevel(String stname,int sstock)
{
	sstock = sstock+5;
	System.out.println(stname+", "+sstock);
	//System.out.println(stname+","+sstock);
}
}



