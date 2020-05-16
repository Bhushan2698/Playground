#include<iostream>
int main()
{
	int no,a=6,i=1;
  std::cin>>no;
  while(no>0)
  {
  	std::cout<<a<<" ";
    a=a+(5*i);
    i++;
    no--;
  }
}