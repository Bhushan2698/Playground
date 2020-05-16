#include<iostream>
int main()
{
	int n1,n2,n3,ans,small=0,gcd=0;
    std::cin>>n1;
    std::cin>>n2;
    std::cin>>n3;
    std::cin>>ans;
    if(n1<n2 && n2<n3)
    {
    	small= n1;
    }
  else if(n2<n3 && n2<n1)
  {
  	small=n2;
  }
  else
  {
  	small=n3;
  }
  
  while(small>=1)
  {
  	if(n1%small==0 && n2%small==0 && n3%small==0)
    {
    	gcd=small;
      break;
    }
    small--;
  }
  
  if(gcd==ans)
  {
  	std::cout<<"Answer is correct.";
  }
  else
  {
  	std::cout<<"Answer is wrong.";
  }
}