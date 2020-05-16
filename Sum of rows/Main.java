#include<iostream>
using namespace std;
int main()
{
  int r,c;
  cin>>r>>c;
  int a[r][c],b[r];
  int i,j,sum=0;
  for(i=0;i<r;i++)
  {
  	for(j=0;j<c;j++)
    {
    	std::cin>>a[i][j];
    }
  }
  for(i=0;i<c;i++)
  {
    sum=0;
  	for(j=0;j<c;j++)
    {
    	sum=sum+a[i][j];
    }
    b[i]=sum;
  }
  for(i=0;i<r;i++)
  {
  	cout<<b[i]<<"\n";
  }
}