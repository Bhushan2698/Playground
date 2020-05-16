#include<iostream>
#include <cstring>
using namespace std;
int main()
{
  char door[10],rear[]="rear",front[]="front";
  int rail;
  std::cin>>door>>rail;
  if(!(strcmp(door,front)))
  {
    if(rail==1)
  	std::cout<<"Left Handed";
    else
      std::cout<<"Right Handed";
  }
  else if(!(strcmp(door,rear))  )
  {
    if(rail==1)
  	std::cout<<"Right Handed";
    else
    std::cout<<"Left Handed";
      
  }
 
}