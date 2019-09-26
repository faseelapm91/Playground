#include <stdio.h>
int sum(int n);
  int main()
  {
    int num,n;
    scanf("%d",&num);
    printf("%d",sum(num));
   return 0;
  }
  int sum(int n)
  {
    int su;
    if(n!=0)
    {
    su=n+sum(n-1);
      return su;
    }
      else
        return 0;
  }
