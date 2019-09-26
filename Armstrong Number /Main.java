#include <stdio.h>
int main() {
	int n,r, power,sum=0,c=0;
  scanf("%d",&n);
  int copy=n;
  while(n>0)
  {
    c=c+1;
    n=n/10;
  }
  n=copy;
  while(n>0)
  {
    r=n%10;
    power=pow(r,c);
    sum=sum+power;
    n=n/10;
  }
  if(sum==copy)
  {
    printf("Armstrong Number");
  }
  else
    printf("Not an Armstrong Number");
}

  
  
  
  
  
  
  
  
  