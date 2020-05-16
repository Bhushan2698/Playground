#include<iostream>
using namespace std;
int main()
{
  int r,c,max;
  cin>>r>>c;
  int a[r][c];
  int i,j,sum=0;
  for(i=0;i<r;i++)
  {
  	for(j=0;j<c;j++)
    {
    	std::cin>>a[i][j];
    }
  }
  max=a[0][0];
  for(i=0;i<r;i++)
  {
  	for(j=0;j<c;j++)
    {
 		if(max<a[i][j])
        {
        	max=a[i][j];
        }
    }
  }
  cout<<"The maximum element is "<<max;
}