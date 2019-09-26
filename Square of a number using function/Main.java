#include<stdio.h>
int square(int num);
int main() 
{
   int n;
  scanf("%d",&n);
  square(n);
 
}
  int square(int num)
  {
    int res=num*num;
     printf("%d",res);
  }
