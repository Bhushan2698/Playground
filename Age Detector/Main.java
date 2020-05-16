#include<iostream>
using namespace std;
int main()
{
  int by,cy,age;
  cin>>by>>cy;
  if(by>cy)
  {
  	by=by+1900;
    cy=cy+2000;
  }
  else
  {
  	by=by+2000;
    cy=cy+2000;
  }
  std::cout<<cy-by;
  
  
}