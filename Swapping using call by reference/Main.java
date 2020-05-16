#include<iostream>
using namespace std;
void swap(int &,int &);
int main()
{
	int a,b;
	std::cin>>a>>b;
	cout<<"Before swapping a= "<<a<<" and "<<"b="<<b;
	swap(a,b);
	cout<<"\nAfter swapping a= "<<a<<" and "<<"b="<<b; 
}
void swap(int &a,int &b)
{
	int c;
	c=a;
	a=b;
	b=c;
	
}