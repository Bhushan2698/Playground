#include <iostream>
int main() 
{
	int no,a;
  std::cin>>no;
  while(no>0)
  {
  	a=no%10;
    no=no/10;
    if(a!=0)
    {
    std::cout<<a;
      
    }
  }
}