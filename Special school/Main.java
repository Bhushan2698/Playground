#include<iostream>
#include<cstring>
using namespace std;
int main()
{
  int j=0,i;
  char f[50];
  char s[50];
  char t[50];
  std::cin>>f>>s;
  int l=strlen(f);
  l--;
  for(i=l;i>=0;i--)
  {
  	t[j]=f[i];
    j++;
  }
  t[j]='\0';
  int res=strcmp(t,s);
    if(res==0)
    {
    	std::cout<<"It is correct";
    }
  	else
    {
    	std::cout<<"It is wrong";
    }
}