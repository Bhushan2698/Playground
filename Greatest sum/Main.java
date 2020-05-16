#include<iostream>
using namespace std;
int main()
{
  int r,c,max;
  cin>>r>>c;
  int a[r][c],b[r],d[r];
  int i,j,sum=0,rn=0;
  for(i=0;i<r;i++)
  {
  	for(j=0;j<c;j++)
    {
    	std::cin>>a[i][j];
    }
  }
  for(i=0;i<r;i++)
  {
    sum=0;
  	for(j=0;j<c;j++)
    {
    	sum=sum+a[i][j];
    }
    b[i]=sum;
  }
  cout<<"Sum of rows is ";
  for(i=0;i<r;i++)
  {
  	cout<<b[i]<<" ";
  }
  max=b[0];
  for(i=0; i<r;i++)
  {
  	if(max<b[i])
    {
      max=b[i];
      rn=i;
    }
  }
  cout<<"\nRow "<<rn+1<<" has maximum sum";
  
  for(i=0;i<c;i++)
  {
    sum=0;
  	for(j=0;j<r;j++)
    {
    	sum=sum+a[j][i];
    }
    d[i]=sum;
  }
  cout<<"\nSum of columns is ";
  for(i=0;i<c;i++)
  {
  	cout<<d[i]<<" ";
  }
  max=d[0];
  rn=0;
  for(i=0; i<c;i++)
  {
  	if(max<d[i])
    {
      max=d[i];
      rn=i;
      
    }
  }
  cout<<"\nColumn "<<rn+1<<" has maximum sum";
}