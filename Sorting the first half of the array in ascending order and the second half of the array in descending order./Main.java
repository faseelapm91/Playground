#include<stdio.h>
int main()
{
  int n,temp;
  scanf("%d",&n);
  int list[n];
  for(int index=0;index<n;index++)
  {
    scanf("%d",&list[index]);
  }
     for(int i=0;i<n/2-1;i++)
  {
   for(int j=0;j<n/2-1;j++)
   {
     
     if(list[j]>list[j+1])
     {
       temp=list[j];
       list[j]=list[j+1];
       list[j+1]=temp;
     }
   }
  }
  for(int i=n/2;i<n;i++)
  {
    for(int j=n/2;j<n-1;j++)
    {
      if(list[j]<list[j+1])
         {
           temp=list[j];
           list[j]=list[j+1];
           list[j+1]=temp;
         }
         }
         }
    for(int i=0;i<n;i++)
{
  printf("%d ",list[i]);
}
return 0;
}