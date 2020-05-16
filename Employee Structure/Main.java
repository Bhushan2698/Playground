#include<iostream>
#include<cstring>
using namespace std;
struct employee 
{ 
  char name[30]; 
  int id; 
  int age;
  char designation[20]; 
  int salary;
};

int main()
{
  employee e;
    std::cout<<"Enter name:";
    cin>>e.name;
    std::cout<<"\nEnter ID:";
    cin>>e.id;
    std::cout<<"\nEnter age:";
    std::cin>>e.age;
    std::cout<<"\nEnter designation:";
    std::cin>>e.designation;
  	std::cout<<"\nEnter Salary:"; 
  	std::cin>>e.salary;
  
  	std::cout<<"\nEmployee Details";
    std::cout<<"\nName of the Employee : "<<e.name;
    std::cout<<"\nID of the Employee : "<<e.id;
    std::cout<<"\nAge of the Employee : "<<e.age;
    std::cout<<"\nDesignation of the Employee : "<<e.designation;
  	std::cout<<"\nSalary of the Employee : "<<e.salary;
}