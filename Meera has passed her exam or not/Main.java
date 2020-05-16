#include<iostream>
int main()
{
  int n,flag=0;
  std::cin>>n;
  int a[n];
  for(int i=0;i<n;i++)
    std::cin>>a[i];
    int b;
  std::cin>>b;
  for(int i=0;i<n;i++)
  {
  
    if(b==a[i])
    
    {
     flag=1;
      break;
      
    
    }
    else
      flag =0;
    
  
    
  }
  
  if(flag==1)
    std::cout<<"She passed her exam";
  else
    std::cout<<"She failed";
}