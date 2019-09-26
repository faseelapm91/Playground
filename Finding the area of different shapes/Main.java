import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      switch(n)
      {
        case 1:
          {
            int i=sc.nextInt();
            int a=i*i;
            System.out.println(a);
          }break;
        case 2:
          {
            int j=sc.nextInt();
            int l=sc.nextInt();
            int b=j*l;
            System.out.println(b);
          }
          break;
        case 3:
          {
            int r=sc.nextInt();
            int e=sc.nextInt();
            int t=((r*e)/2);
            System.out.println(t);
          }
          break;
        case 4:
          {
          double r=sc.nextInt();
            double pi=3.14;
            double c=pi*r*r;
            System.out.println(c);
          }
      }
        }
       }
