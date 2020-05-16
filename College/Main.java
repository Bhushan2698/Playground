#include<iostream>
#include<cstring>
using namespace std;
struct College 
{ 
  char name[100]; 
  char city[100]; 
  int establishmentYear; 
  float passPercentage; 
};
int comparator(const void* p, const void* q) 
{ 
    return strcmp(((struct College*)p)->name, 
                  ((struct College*)q)->name); 
}
int main()
{
  int n,i;
  cout<<"Enter the number of colleges";
  cin>>n;
  College e[n];
  for(i=0;i<n;i++)
  {
  	std::cout<<"\nEnter the details of college "<<i+1;
    std::cout<<"\nEnter name";
    cin>>e[i].name;
    std::cout<<"\nEnter city";
    cin>>e[i].city;
    std::cout<<"\nEnter year of establishment";
    std::cin>>e[i].establishmentYear;
    std::cout<<"\nEnter pass percentage";
    std::cin>>e[i].passPercentage;
  }
  
  qsort(e,n,sizeof(struct College),comparator);
  std::cout<<"\nDetails of colleges";
  
  for(i=0;i<n;i++)
  {
  	std::cout<<"\nCollege:"<<i+1;
    std::cout<<"\nName:"<<e[i].name;
    std::cout<<"\nCity:"<<e[i].city;
    std::cout<<"\nYear of establishment:"<<e[i].establishmentYear;
    std::cout<<"\nPass percentage:"<<e[i].passPercentage;
  }
}