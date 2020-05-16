#include<iostream>
using namespace std;
int main()
{
  int no,i=2,fn=0,sn=1,temp;
  std::cin>>no;
  while(i<no)
  {
  	temp=fn;
    fn=sn;
    sn=sn+temp;
    i++;
  }	
  std::cout<<sn;
}