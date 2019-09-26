#include<stdio.h>
#include<string.h>
int main()
{
  char str[1000];
  gets(str);
  int i,length;
  length=strlen(str);
  for(i=length-1;i>=0;i--)
  {
    if(str[i]==' ')
    {
  printf("%s ",&str[i+1]);
    str[i]='\0';
  }
  }
  printf("%s",str);
  return 0;
}