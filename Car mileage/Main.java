#include<iostream>
using namespace std;
int main()
{
  float mileage;
  int petrol,dist;
  std::cin>>mileage>>petrol>>dist;
  if(dist>mileage*petrol)
  {
  	std::cout<<"Cannot reach";
  }
  else
  {
  	std::cout<<"Can reach";
  }
}