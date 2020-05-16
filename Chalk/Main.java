#include<iostream>
#include <cmath> 
#include <iomanip>
int main()
{
    int chalk,fdays;
    float a,days,temp;
    std::cin>>chalk;
    days = chalk;
    a=1/sqrt(chalk);
    while(chalk>1)
    {
        temp=0;
        temp=a*chalk;
        days=days+temp;
        chalk=temp;
    }
  fdays=int(days);
    std::cout<<fdays;
}