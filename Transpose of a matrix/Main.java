#include<stdio.h>
int main()
{
  int row,col;
  scanf("%d%d",&row,&col);
  int matrix[row][col];
  for(int i=0;i<row;i++)
  {
    for(int j=0;j<col;j++)
    {
      scanf("%d",&matrix[i][j]);
    }
  }
  int transpose[col][row];
for(int i=0;i<row;i++)
{
  for(int j=0;j<col;j++)
  {
    transpose[j][i]=matrix[i][j];
  }
}
  for(int i=0;i<col;i++)
  {
    for(int j=0;j<row;j++)
    {
      printf("%d ",transpose[i][j]);
    }
    printf("\n");
  }
  return 0;
}
  
  
  
    
  