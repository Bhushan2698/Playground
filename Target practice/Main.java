#include<iostream>
using namespace std;
int main()
{
  int score,sum=0,a=0,i=0;
  std::cin>>score;
  
  while(sum<score)
  {
  	std::cin>>a;
    
    sum=sum+a;
    i++;
  }
  std::cout<<"The number of turns is "<<i;
  
}