#include<iostream>
using namespace std;
int main()
{
  int w,x,y;
  int result;
  std::cin>>w;
  std::cin>>x;
  std::cin>>y;
  
  result = (w*(x-y))-100;
  std::cout<<result;
}