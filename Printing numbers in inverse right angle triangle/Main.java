#include <stdio.h>
int main() {
    int i,j,n;
  scanf("%d",&n);
     int num=n;
        for(i=1;i<=num;i++)
        {
          for(j=n;j>=1;j--)
          {
            printf("%d",j);
          }
          n=n-1;
          printf("\n");
        }
	return 0;
}