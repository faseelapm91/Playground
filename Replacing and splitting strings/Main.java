import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      String string1=sc.nextLine();
      String string2=sc.nextLine();
      String arr=string1.replace(string1,string2);
      String[] arra= arr.split("\\s"); 
for (String a : arra) 
{
            System.out.println(a); 
}
    }
}