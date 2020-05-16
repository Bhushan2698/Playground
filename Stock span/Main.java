#include<iostream>
using namespace std;
void stockSpan(int n,int *a){
  int i,t,x=1,k;
for(i=1;i<=n;i++){
  
  if( i==1){
    t=1;
  cout<<t<<"\n";
  }
    else{
      if(a[i]<a[i-1])
      {
        t=1;
      cout<<t<<"\n";
    }
     else if(a[i]>a[i-1]){
       k=2*x;
        x+=1;
       
        cout<<k<<"\n";
      }
    	
    }
  }
}
int main()
{
  void stockSpan(int,int*);
  int n,i;
  cin>>n;
  int a[n+1];
  for(i=0;i<=n;i++)
  {
  	if(i==0){
    	a[0]=n;
    }
    else
      cin>>a[i];
  }
  stockSpan(n,a);
  
  
  
  //Type your code here.
}