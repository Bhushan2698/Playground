#include<iostream>
using namespace std;
int main()
{
  int r,c,max=0;
  cin>>r>>c;
  if(r<10 && r<10)
  {
  int a[r][c],b[c];
  int i,j;
  for(i=0; i<r;i++)
  {
  	for(j=0; j<c;j++)
    {
    	std::cin>>a[i][j];
    }
  }
  for(i=0;i<c;i++)
  {
    max=a[0][i];
  	for(j=0;j<r;j++)
    {
    	if(max<a[j][i])
        {
        	max=a[j][i];
        }
    }
    b[i]=max;
  }
  
  for(i=0;i<c;i++)
  {
  	std::cout<<b[i]<<"\n";
  }
  }
}