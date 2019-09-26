
class MyModel1 {
     //write your logic here
  int camera =2;
  String lock = "no lock";
   int Display = 5;
 public MyModel1(){
   System.out.println("Features of MyModel 1");
   System.out.println("Camera mega pixels: "+camera); 
}
}
class MyModel2 extends MyModel1 {
  int camera=5;
  public MyModel2(){
     System.out.println("Features of MyModel 2");
     System.out.println("Camera mega pixels: "+camera+"\nLock mechanism: Fingerprint"+"\nDisplay size: "+Display);
	}
}
class MyModel2T extends MyModel2 {
  int camera=16;
  int Display=6;
       public MyModel2T(){
     System.out.println("Features of MyModel 2T");
     System.out.println("Camera mega pixels: "+camera);
         System.out.println("Lock mechanism: Fingerprint"+"\nDisplay size: "+Display);
	}
}
public class Main 
{
    public static void main(String[] args) 
    {
     //MyModel1 m = new MyModel1();
      MyModel2T n = new MyModel2T();
      
          //write your logic here
    }
}