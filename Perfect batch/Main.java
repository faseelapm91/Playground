// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
// Main function
int main()
{
  int i,size;
  scanf("%d",&size);
  int arr[size],sum1=0,sum2=0;
  for(int i=0;i<size;i++)
  {
    scanf("%d",&arr[i]);
  }
  for(i=0;i<size/2;i++)
  {
    sum1=sum1+arr[i];
  }
  for(i=((size/2));i<size;i++)
  {
    sum2=sum2+arr[i];
  }
  if(sum1==sum2)
  {
    printf("Perfect Batch");
  }
  else
  {
    printf("Not a Perfect Batch");
  }
}
  
   