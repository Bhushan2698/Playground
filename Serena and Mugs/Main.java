#include<iostream>
using namespace std;
int main()
{
  int n,capacity,sum=0;
  cin>>n>>capacity;
  int a[n],i;
  for(i=0;i<n;i++)
  {
  	cin>>a[i];
  }
  for(i=0;i<n;i++)
  {
  	sum=sum+a[i];
  }
  if(sum>capacity)
  {
  	cout<<"NO";
  }
  else
  {
  	cout<<"YES";
  }
}