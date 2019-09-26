#include<stdio.h>
int main()
{
  int n,num,r,sum,num1;
  scanf("%d",&n);
  num=n;
  r=num%10;
  num1=num/100;
  sum=r+num1;
  printf("%d",sum);
  return 0;
}