#include<iostream>
using namespace std;
struct time
{
	int h;
  	int m;
  	int s;
};
int main()
{
 struct time t1;
  struct time t2;
 struct time dif;
  cin>>t1.h>>t1.m>>t1.s>>t2.h>>t2.m>>t2.s;
  dif.s=t1.s-t2.s;
  dif.m=t1.m-t2.m;
  dif.h=t1.h-t2.h;
  if(dif.s<0)
  {
  	dif.s=dif.s+60;
    dif.m--;
  }
  if(dif.m<0)
  {
  	dif.m=dif.m+60;
    dif.h--;
  }
  
  std::cout<<dif.h<<":"<<dif.m<<":"<<dif.s;
}