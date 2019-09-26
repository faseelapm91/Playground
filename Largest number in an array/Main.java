#include<stdio.h>
int main()
{
  int arrsize;
  scanf("%d",&arrsize);
  int arr[10];
    for(int idx=0;idx<=arrsize-1;idx++)
    {
      scanf("%d",&arr[idx]);
         }
        int max;
         if(arr[0]>arr[1])
            {
          max=arr[0];
               }
         else
                {
          max=arr[1];
                }
    for(int idx=2;idx<=arrsize-1;idx++)
                      {
    if(max<arr[idx])
      {
    max=arr[idx];
    }
    }
  printf("%d\n",max);
}

  