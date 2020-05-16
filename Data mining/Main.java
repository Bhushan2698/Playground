#include<iostream>
using namespace std;
int main()
{
  int num,even=0,odd=0,i=1,a,b;
  std::cin>>num;
  while(num>0)
  {
  	if(i%2!=0)
    {
    	a=num%10;
      	num=num/10;
      odd=odd+a;
      i++;
    }
    else
    {
    	b=num%10;
      num=num/10;
      even=even+b;
      i++;
    }
  }
  if(odd==even)
  {
  	std::cout<<"Yes";
  }
  else
  {
  		std::cout<<"No";
  }
}