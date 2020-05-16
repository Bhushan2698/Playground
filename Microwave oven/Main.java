#include<iostream>
using namespace std;
int main()
{
  int no;
  float time;
  cin>>no>>time;
  if(no>3)
  {
  	cout<<"Number of items is more";
  }
  else if(no==2)
  {
  	time= time+(0.5*time);
    cout<<time;
  }
  else if(no==3)
  {
  	time= 2*time;
    cout<<time;
  }

}