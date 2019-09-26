#include<stdio.h>
int main()
{
	int r,c,flag=0;
  scanf("%d%d",&r,&c);
  int mat1[r][c];
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
      scanf("%d",&mat1[i][j]);
    }
  }
    int mat2[r][c];
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
      {
        scanf("%d",&mat2[i][j]);
      }
    }
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
      {
     if(mat1[i][j]==mat2[i][j])
      {
     flag=1;
      }
        else
        {
          flag=0;
        break;}
        
      }
    }
  if(flag==1)
  {
    printf("Yes");
  }
  else
  {
    printf("No");
  }
return 0;
}