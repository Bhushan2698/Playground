#include<iostream>
using namespace std;
struct feet
{
	int f;
  float i;
};
int main()
{
  
  struct feet f1;
  struct feet f2;
  struct feet sum;
  std::cin>>f1.f>>f1.i>>f2.f>>f2.i;
  sum.i=f1.i+f2.i;
  sum.f=f1.f+f2.f;
  if(sum.i>=12)
  {
  	sum.i=sum.i-12;
    sum.f++;
  }
  std::cout<<sum.f<<"'-"<<sum.i<<"\"";
}