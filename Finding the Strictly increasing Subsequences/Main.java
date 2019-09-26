#include<stdio.h>
int main()
{
 int n,i,j;
  scanf("%d",&n);
  int list[n];
 for(int i=0;i<n;i++)
 {
   scanf("%d",&list[i]);
 }
  for(int i=0;i<n;i++)
  {
    for(int j=i;j<n;j++)
    {
      if((list[j]>list[i])&&(list[j]>list[j-1]))
      {
        printf("%d,%d\n",list[i],list[j]);
      }
    }
  }
 
  return 0;
}