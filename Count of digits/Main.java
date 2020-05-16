#include<iostream>
int main()
{
  int no,i=0;
  std::cin>>no;
  do
  {
  	no=no/10;
    i++;
  }while(no>0);
  std::cout<<i;
}