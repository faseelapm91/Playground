#include<stdio.h>
int factorial(int n);
int main()
{
	int n,fact=1;
  scanf("%d",&n);
  printf("%d",factorial(n));
  return 0;
}
  int factorial(int n)
{int fact=1;
    if(n>=1)
    {
    fact=n*factorial(n-1);}
     else
     return 1;
  }
  