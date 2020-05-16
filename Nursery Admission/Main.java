#include<iostream>
#include<cstring>
using namespace std;
int main()
{
  char name[50];
  std::cin>>name;
  int length=strlen(name);
  std::cout<<"The number of letters in the name is "<<length;
}