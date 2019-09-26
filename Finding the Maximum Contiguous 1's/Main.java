 #include<stdio.h>
int main()
{
  int n,i;
  scanf("%d",&n);
  int arr[n];
  for(i=0;i<n;i++)
    {
    scanf("%d",& arr[i]);
  }
  int count=0;
    for(i=0;i<n;i++)
    {
      if(arr[i]==1)
      {
        count++;
}
      else
      {
      break;
      }
    }
  printf("%d",count);
    return 0;
}
  