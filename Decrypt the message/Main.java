#include<iostream>
int main()
{
	int a,b,c;
  std::cin>>a;
  std::cin>>b;
  c=a+b;
  int temp=0;
  int i=1;
  while(i<c)
  {
  	if(c%i==0)
    {
    	temp=temp+i;
    }
    i++;
  }
  if(temp==c)
  {
  	std::cout<<"They can read the message";
  }
  else
  {
  	std::cout<<"They can't read the message";
  }
}