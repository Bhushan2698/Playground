#include <iostream>
using namespace std;

int main()
{
  int n, i;
  bool isPrime = true;

  
  cin >> n;
	if(n==1)
    {
    	cout << "Not eligible";
      return 0;
    }
  for(i = 2; i < n ; ++i)
  {
      if(n % i == 0)
      {
          isPrime = false;
          break;
      }
  }
  if (isPrime)
      cout << "Eligible";
  else
      cout << "Not eligible";

  return 0;
}