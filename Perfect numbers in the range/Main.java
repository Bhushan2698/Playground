#include<iostream>
int main()
{
	int fno,sno;
  std::cin>>fno;
  std::cin>>sno;
  int i=1;
  int temp=0;
  while(fno<=sno)
  {
    i=1;
      temp=0;
  	while(i<fno)
    {
      	if(fno%i==0)
    	{
    		temp=temp+i;
        	
    	}
      i++;
    }
    if(temp==fno)
  	{
  		std::cout<<fno<<" ";
  	}
 	fno++;
  }
}