#include<stdio.h>
int main()
{
 int r,c;
  scanf("%d%d",&r,&c);
  int mat[r][c];
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
      scanf("%d",&mat[i][j]);
    }
  }
  for(int i=c-1;i>=0;i--)
  {
    for(int j=0;j<r;j++)
    {
      printf("%d ",mat[j][i]);
    }
    printf("\n");
  }
	return 0;
}