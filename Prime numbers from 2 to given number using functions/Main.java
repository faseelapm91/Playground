#include<stdio.h>
int prime(int num);
int main(){
    int n,i,p,num;
  scanf("%d",&n);
  for(i=2;i<=n;i++)
  {
    p=prime(i);
    if(p==1)
      printf("%d\n",i);
  }
}
  int prime(int n)
  {
    int num=2,prime=1;
    while(num<=n/2)
    {
      if(n%num==0)
      {
        prime=0;break;
      }
      num++;
    }
    return prime;
  }
    
   