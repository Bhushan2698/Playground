#include<iostream>
#include<cstring>
using namespace std;
struct Student 
{ 
  char name[30]; 
  char department[20]; 
  int yearOfStudy; 
  float cgpa; 
};
int comparator(const void* p, const void* q) 
{ 
    return strcmp(((struct Student*)p)->name, 
                  ((struct Student*)q)->name); 
}
int main()
{
  int n,i;
  cout<<"Enter the number of students";
  cin>>n;
  Student s[n];
  for(i=0;i<n;i++)
  {
  	std::cout<<"\nEnter the details of student "<<i+1;
    std::cout<<"\nEnter name";
    cin>>s[i].name;
    std::cout<<"\nEnter department";
    cin>>s[i].department;
    std::cout<<"\nEnter year of study";
    std::cin>>s[i].yearOfStudy;
    std::cout<<"\nEnter cgpa";
    std::cin>>s[i].cgpa;
  }
  
  qsort(s,n,sizeof(struct Student),comparator);
  std::cout<<"\nDetails of students";
  
  for(i=0;i<n;i++)
  {
  	std::cout<<"\nStudent "<<i+1;
    std::cout<<"\nName:"<<s[i].name;
    std::cout<<"\nDepartment:"<<s[i].department;
    std::cout<<"\nYear of study:"<<s[i].yearOfStudy;
    std::cout<<"\nCGPA:"<<s[i].cgpa;
  }
}