#include<iostream>
using namespace std;
int main()
{
  int capacity,adult,child,total,totala,totalc;
  std::cin>>capacity;
  std::cin>>adult;
  std::cin>>child;
  totala=adult*75;
  totalc=child*30;
  total=totala+totalc;
  if(capacity>=total)
  {
  	std::cout<<"Boat is stable";
  }
  else
  {
  	std::cout<<"Boat will drow";
  }
}