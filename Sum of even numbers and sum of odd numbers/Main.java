#include<iostream>
using namespace std;
int main()
{
  int a[15],even=0,odd=0;
  int n,i;
  cin>>n;
  for(i=0;i<n;i++)
  {
  	cin>>a[i];
    if(a[i]%2==0)
    {
    	even=even+a[i];
    }
    else if(a[i]%2!=0)
    {
    	odd=odd+a[i];
    }
  }
  cout<<"The sum of the even numbers in the array is "<<even;
  cout<<"\nThe sum of the odd numbers in the array is "<<odd;
}