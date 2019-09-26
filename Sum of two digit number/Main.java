#include<stdio.h>
int main()
{
  int n, num,num1,num2,sum=0;
  scanf("%d",&num);
  //num=n;
  num2=num%10;
  num1=num/10;
  sum=num1+num2;
  printf("%d",sum);
  return 0;
}