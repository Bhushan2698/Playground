#include<iostream>
using namespace std;
int main()
{
  int r,c,sum=0;
  std::cin>>r>>c;
  int i,j,a[r][c];
  for(i=0;i<r;i++)
  {
  	for(j=0;j<c;j++)
    {
    	std::cin>>a[i][j];
    }
  }
  for(i=0;i<r;i++)
  {
  	sum=sum+a[0][i];
    sum=sum+a[r-1][i];
  }
  j=c-2;
  for(i=1;i<r-1;i++)
  {
  	sum=sum+a[i][j];
    j--;
  }
  cout<<"Sum of Zig-Zag pattern is "<<sum;
}