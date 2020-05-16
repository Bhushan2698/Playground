#include<iostream>
using namespace std;
int main()
{
  int age,amt=0;
  float time;
  std::cin>>age>>time;
  if(age<=13)
  {
  	if(time==13.30f)
    {
    	amt=2;
    }
    else
    {
    	amt=4;
    }
  }
  if(age>13)
  {
  	if(time==13.30f)
    {
    	amt=5;
    }
    else
    {
    	amt=8;
    }
  }
  cout<<"$"<<amt<<".00";
}