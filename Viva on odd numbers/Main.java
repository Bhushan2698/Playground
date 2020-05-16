#include<iostream>
using namespace std;
int main()
{
  float score=0;
  int no,i=0;
  std::cin>>no;
  while(no>0 && i<3)
  {
  	if(no%2!=0)
    {
    	score++;
      i++;
      std::cin>>no;
    }
    else if(no%2==0)
    {
    	score=score-0.5;
      std::cin>>no;
    }
  }
  if(no<0)
  {
  	score=score-1;
  }
  std::cout<<score;
}