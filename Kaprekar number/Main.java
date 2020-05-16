#include<iostream>
#include <cmath> 
using namespace std;
int main()
{
  int no,sqno,i=0,temp1,temp2,nos,sqnos,a=0,b=0,c;
  std::cin>>no;
  sqno=no*no;
  temp1=no;
  temp2=sqno;
  while(temp1>0)
  {
  	temp1=temp1/10;
    i++;
  }
  nos=i;
  i=0;
    while(temp2>0)
  {
  	temp2=temp2/10;
    i++;
  }
  sqnos=i;
  
  if(sqnos%2==0)
  {
  	a=sqno/(pow(10,(sqnos/2)));
  	b=sqno%(int)pow(10,(sqnos/2));
  	c=a+b;
  }
  else
  {
    a=sqno/(pow(10,(sqnos/2)+1));
    b=sqno%(int)pow(10,(sqnos/2)+1);
    c=a+b;
  }
  if(c==no)
  {
      std::cout<<"Kaprekar Number";
  }
  else
  {
      std::cout<<"Not a Kaprekar Number";
      
  }
}