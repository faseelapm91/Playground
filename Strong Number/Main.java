#include <stdio.h>
int main() {
	int n;
  scanf("%d",&n);
  int num=n,sum=0;
  while(num!=0)
  {
     int fact=1;
    int r=num%10;
   
    for(int i=1;i<=r;i++)
    {
     fact=fact*i;
    }
    sum=sum+fact;
    num=num/10;
  }
    if(sum==n)
      printf("Yes");
    else
      printf("No");
	return 0;
}