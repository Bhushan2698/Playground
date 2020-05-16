#include<iostream>
using namespace std;
int main()
{
  int no,i=0;
  std::cin>>no;
  std::cout<<no<<"\n";
  while(no!=1)
  {
  	if(no%2==0)
    {
    	no=no/2;
    }
    else
    {
    	no=3*no+1;
    }
    i++;
    std::cout<<no<<"\n";
  }
  std::cout<<i;
}