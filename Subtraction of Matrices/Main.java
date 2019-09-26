#include<stdio.h>
int main()
{
  int row,col;
  scanf("%d%d",&row,&col);
  int matrix1[row][col];
  for(int i=0;i<row;i++)
  {
    for(int j=0;j<col;j++)
    {
      scanf("%d",&matrix1[i][j]);
    }
  }
  int matrix2[row][col];
  for(int i=0;i<row;i++)
  {
    for(int j=0;j<col;j++)
    {
      scanf("%d",&matrix2[i][j]);
    }
  }
  for(int i=0;i<row;i++)
  {
    for(int j=0;j<col;j++)
    {
      int sub[row][col];
      sub[i][j]=matrix1[i][j]-matrix2[i][j];
    }
  }
  int sub[row][col];
for(int i=0;i<row;i++)
{
  for(int j=0;j<col;j++)
  {
    printf("%d ",sub[i][j]);
  }
  printf("\n");
}
	return 0;
}