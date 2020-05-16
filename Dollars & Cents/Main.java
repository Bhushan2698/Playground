#include<iostream>
using namespace std;
int main()
{
  int fd,fc,sd,sc,dd,cc;
  	std::cin>>fd;
    std::cin>>fc;
    std::cin>>sd;
    std::cin>>sc;
  dd=fd+sd;
  cc=fc+sc;
  if(cc>=100)
  {
  	dd=dd+1;
    cc=cc-100;
  }
  std::cout<<dd<<"\n";
  std::cout<<cc;
}