#include<stdio.h>
int sum(int b,int e);
int main(){
 int b,e;
  scanf("%d%d",&b,&e);
  int p=sum(b,e);
  printf("%d",p);
}
  int sum(int b,int e)
  {
    int p=pow(b,e);
    //printf("%d",p);
  }
  	
