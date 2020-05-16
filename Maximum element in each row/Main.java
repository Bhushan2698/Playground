#include<iostream>
using namespace std;
int main()
{
  int r,c,max=0;
  cin>>r>>c;
  int a[r][c],b[r];
  int i,j;
  for(i=0; i<r;i++)
  {
  	for(j=0; j<c;j++)
    {
    	std::cin>>a[i][j];
    }
  }
  for(i=0;i<r;i++)
  {
    max=a[i][0];
  	for(j=0;j<c;j++)
    {
    	if(max<a[i][j])
        {
        	max=a[i][j];
        }
    }
    b[i]=max;
  }
  
  for(i=0;i<r;i++)
  {
  	std::cout<<b[i]<<"\n";
  }
  
}