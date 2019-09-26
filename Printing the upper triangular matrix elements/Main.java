#include<stdio.h>
int main()
{
int r,c,i,j;
  scanf("%d%d",&r,&c);
  int mat[r][c];
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
      scanf("%d",&mat[i][j]);
    }
  }
      int k;
      for(k=0;k<c;k++)
      {
        for(i=0,j=k;j<c;i++,j++)
        {
          printf("%d ",mat[i][j]);
        }
      }
      return 0;
    }
          
      
	