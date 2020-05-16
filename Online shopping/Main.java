#include<iostream>
using namespace std;
int main()
{
  int fa,fd,fs,aa,ad,as,sa,sd,ss;
  string b;
  cin>>fa>>fd>>fs>>sa>>sd>>ss>>aa>>ad>>as;
  float f,a,s;
  f=fa+fs-(fa*fd*0.01);
  a=aa+as-(aa*ad*0.01);
  s=sa+ss-(sa*sd*0.01);
  cout<<"In Flipkart Rs."<<f;
    cout<<"\nIn Snapdeal Rs."<<s;
  cout<<"\nIn Amazon Rs."<<a;

  
  if(f<=a && f<=s)
  {
  	b="Flipkart";
  }
  else if(a<=f && a<=s)
  {
  	b="Amazon";
  }
  else if(s<=f && s<=a)
  {
  	b="Snapdeal";
  }
  cout<<"\nHe will prefer "<<b;
}