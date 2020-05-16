#include<iostream>
using namespace std;
int main()
{
  int hands,handshakes;
  std::cin>>hands;
  handshakes = (hands*(hands-1))/2;
  std::cout<<handshakes;
}