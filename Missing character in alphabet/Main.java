// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include<stdio.h>
//#include<conio.h>
#include<string.h>
int main()
{
  char str[100];
  scanf("%[^\n]s",str);
  int i,j,count[26]={0};
   while(str[i]!='\0')
   {
    if(str[i]>='a' && str[i]<='z')
    {
      j=str[i]-'a';
      count[j]++;
    }
     i++;
   }
  for( i=0;i<26;i++)
  {
    if(count[i]==0)
    {
      printf("%c ",i+'a');
      count[i]=0;
    }
  }
  return 0;
}
      