#include<stdio.h>
int main()
{
int n;
  scanf("%d",&n);
  int list[n];
  for(int index=0;index<n;index++)
  {
    scanf("%d",&list[index]);
  }
  for(int i=0;i<n;i++)
  {
    for(int j=i;j<n;j++)
    {
      if(list[j]>list[i])
         {
           printf("%d,%d\n",list[i],list[j]);
         }
         }
         }
         return 0;
         }
	