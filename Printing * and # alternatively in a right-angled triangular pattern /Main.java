#include <stdio.h>
int main(){
int n,j,i;
 scanf("%d",&n);
  int flag=0;
  for(i=1;i<=n;i++)
       {
    for(j=1;j<=i;j++)
   {
     if(flag==0)
     {
     printf("*");
       flag=1;
     }
     else
       
     {
       
printf("#");
       flag=0;
     }
   }printf("\n");
  }
  	return 0;
}
