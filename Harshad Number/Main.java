#include<iostream>
using namespace std;
int main()
{
  int no,sum=0,r=0;
  std::cin>>no;
  int temp=no;
  while(no>0)
  {
  	r=no%10;
    sum=sum+r;
    no=no/10;
  }
  if(temp%sum==0)
  {
  	std::cout<<"Harshad Number";
  }
  else
    {
  	std::cout<<"Not Harshad Number";
  }
    
}