import java.util.Scanner;
class Faculty
{
  public void salary(int c)
  {
    System.out.println("Base Salary: " +c );
  }
}
class CSE extends Faculty
{
  public void salary(int c)
  {
   
    System.out.println("CSE Faculty: " +(c+3000) );
    
  }
}
class IT extends Faculty
{
  public void salary(int c)
  {
   System.out.println("IT Faculty: " +(c+5000));
  }
}
class ECE extends Faculty
{
  public void salary(int c)
  {
    System.out.println("ECE Faculty: " +(c+4500));
  }
}

class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
     int c = sc.nextInt();
    Faculty f = new Faculty();
    f.salary(c);
    CSE  d = new CSE();
    d.salary(c);
    IT i = new IT();
    i.salary(c);
    ECE e = new ECE();
    e.salary(c);
  }
}
 