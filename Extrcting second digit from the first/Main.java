#include <stdio.h>
int main()
{
	int n,l;
  scanf("%d",&n);
  while(n>100)
  {
    n=n/10;
  l=n%10;
}
printf("%d",n%10);
	return 0;
}