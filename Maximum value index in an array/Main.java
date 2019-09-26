// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
// Main function
int main()
{
  // Type your code here int main()
{
  int arrsize;
  int idx;
  scanf("%d",&arrsize);
  int arr[arrsize];
  for(int index=0;index<=arrsize-1;index++)
  {
    scanf("%d",&arr[index]);
  }
  int max;
  {
    if(arr[0]>arr[1])
    {
       max=arr[0];
    }
    else
    {
      max=arr[1];
    }
     for(int index=2;index<=arrsize-1;index++)
     {
       if(max<arr[index])
       {
         max=arr[index];
       }
       
     if(max==arr[index])
        idx=index;
     }
        printf("%d",idx);
    }
  
}
  
   return 0;
}