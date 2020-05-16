#include<iostream>
#include<cstdlib>
int main(){
  // Type your code here
  int n,c=0,b=0;
  int *p,*ptr;
  std::cin>>n;
  int a[n];
  for(int i=0;i<n;i++)
  {
    std::cin>>a[i];
  }
  for(int i=0;i<n;i++)
  {
    if(a[i]%2==0)
      b++;
    else
      c++;
  }
  p=(int *)malloc(b*sizeof(int));
  ptr=(int *)malloc(c*sizeof(int));
  std::cout<<c<<"\n"<<b;
  return 0;
}