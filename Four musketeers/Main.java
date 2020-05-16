#include<iostream>
using namespace std;
int main()
{
  int x1,x2,x3,y1,y2,y3;
  float c1,c2;
  	  std::cin>>x1;
      std::cin>>y1;
      std::cin>>x2;
      std::cin>>y2;
      std::cin>>x3;
      std::cin>>y3;
  c1=(((float)x1+(float)x2+(float)x3)/3);
  c2=(((float)y1+(float)y2+(float)y3)/3);
  std::cout<<c1;
  std::cout<<"\n"<<c2;
}