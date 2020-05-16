#include<iostream>
#include <bits/stdc++.h> 
using namespace std;
int gcd(int a, int b) 
{ 
    if (a == 0) 
        return b; 
    return gcd(b % a, a); 
} 
  
// Function to find gcd of array of 
// numbers 
int findGCD(int arr[], int n) 
{ 
    int result = arr[0]; 
    for (int i = 1; i < n; i++) 
        result = gcd(arr[i], result); 
  
    return result; 
} 
int main()
{
  int a[3];
  int h,sc,d;
  for(int i=0;i<3;i++)
  {
  std::cin>>a[i];
  }
  sort(a,a+3);
  std::cout<<"The treasure is in box which has number "<<a[1];
  
  std::cout<<"\nThe code to open the box is "<<findGCD(a, 3);
}