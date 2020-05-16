#include<iostream>

using namespace std;
int main()
{
  int n,a=1,z=0,i=1;
  std:cin>>n;
  while(n>0)
  {
    if(i==1)
    {
    z=(a*a)-1;
    std::cout<<z<<" ";
    a++;
    n--;
      i--;
    }
    else if(i==0)
    {
    z=(a*a)-2;
    std::cout<<z<<" ";
    a++;
    n--;
      i++;
    }
  }
}