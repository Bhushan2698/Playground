#include<iostream>
#include<string>
using namespace std;
int main()
{
std::string s0;
std::getline(std::cin,s0);
for(std::string::reverse_iterator i=s0.rbegin();i<s0.rend();i++)
{
cout<<*i;
}
}