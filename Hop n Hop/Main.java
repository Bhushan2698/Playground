#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  int x,y,res;
  std::cin>>x;
  std::cin>>y;
  res= sqrt((pow((x-3),2)) + (pow((y-4),2)));
  std::cout<<res;
}