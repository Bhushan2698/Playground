#include<iostream>
#include<cmath>
int main()
{
	int no, a=11;
  std::cin>>no;
  while(no>0)
  {
  	std::cout<<pow(a,2)<<" ";
    a+=4;
  	no--;
  }
}