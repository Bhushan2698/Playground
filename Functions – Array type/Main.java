#include<iostream>
using namespace std;
int main()
{
  int a[20];
  int n;
  cout<<"Enter the number of elements in the array";
  std::cin>>n;
  int i;
  cout<<"\nEnter the elements in the array\n";
  int even=0,odd=0;
  for(i=0;i<n;i++)
  {
  	cin>>a[i];
  }
  for(i=0;i<n;i++)
  {
  	if(a[i]%2==0)
    {
    	even=1;
    }
    else if(a[i]%2!=0)
    {
    	odd=1;
    }
  }
  if(even==1 && odd==1)
  {
  	cout<<"The array is Mixed";
  }
  else if(even==1)
  {
  	cout<<"The array is Even";
  }
  else
  {
  	cout<<"The array is Odd";
  }
}