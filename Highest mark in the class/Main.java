#include<iostream>
int main()
{
  // Type your code here
  int n,s;
  std::cin>>n;
   int a[n];
  for(int i=0;i<n;i++)
  {
  std::cin>>a[i];
    s=a[0];
  
  
  
  }
  for(int i=0;i<n;i++)
  {
    if(s<a[i])
      s=a[i];
    
  }
  std::cout<<s;
  
}