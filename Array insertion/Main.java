#include<iostream>
using namespace std;
int main()
{
  int a[20];
  int n,i,x;
  cout<<"Enter the number of elements in the array";
  std::cin>>n;
  x=n;
  cout<<"\nEnter the elements in the array";
  for(i=0;i<n;i++)
  {
  	std::cin>>a[i];
  }
  int loc;
  cout<<"\nEnter the location where you wish to insert an element";
  std::cin>>loc;
  if(loc>n)
  {
    cout<<"\nInvalid Input";
  	return 0;
  }
  loc--;
  int value;
  cout<<"\nEnter the value to insert";
  std::cin>>value;
  int temp;
  while(n>=loc)
  {
  	a[n]=a[n-1];
    n--;
  }
  a[loc]=value;
  cout<<"\nArray after insertion is\n";
  for(i=0;i<x+1;i++)
  {
  	cout<<a[i]<<"\n";
  }
}