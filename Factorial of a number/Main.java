#include<iostream>
int main(){
  int no,i,sum=1;
  std::cin>>no;
  for(i=no;i>1;i--)
  {
  	sum=sum*i;
  }
  std::cout<<sum;
}