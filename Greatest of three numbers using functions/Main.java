#include <stdio.h>
int gcr(int n1,int n2);
int main(){
	int n1,n2,n3,c;
  scanf("%d%d%d",&n1,&n2,&n3);
   c=gcr(n1,n2);
  printf("%d",gcr(n3,c));
  	
}
int gcr(int n1,int n2)
{
  int max=0;
  if(n1>n2)
  {
    max=n1;
  }
  else
  {
    max=n2;
  }
  return max;
}
    