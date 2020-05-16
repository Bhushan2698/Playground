#include<iostream>
using namespace std;
int main()
{
  int units,cost;
  std::cin>>units;
  if(units<=200)
  {
    cost=units*0.5;
  	std::cout<<"Rs."<<cost;
  }
  else if(units<=400 && units>200)
  {
    cost=(units*0.65)+100;
  	std::cout<<"Rs."<<cost;
  }
  else if(units<=600 && units>400)
  {
    cost=((units*0.80)+200);
  	std::cout<<"Rs."<<cost;
  }
  else if(units>600)
  {
    cost=((units*1.25)+425);
  	std::cout<<"Rs."<<cost;
  }
}