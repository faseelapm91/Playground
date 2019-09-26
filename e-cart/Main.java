import java.util.Scanner;
class Item
{
  private int price;
  
}
   
class Customer
{
  private String product;
  private int quantity;
}

class Bill
{
  public void amount (int price,int quantity)
  {
	  //int price,quantity;
	  int d = price*quantity;
	   System.out.println("Total Price is : "  +d);
  }
  
}
class Main
{
  public  static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    String product = sc.nextLine();
    int quantity = sc.nextInt();
    int price = sc.nextInt();
    Bill obj = new Bill();
    obj.amount(price,quantity);
    
  }
}