#include<iostream>
int main()
{
	int fno,sno,ch,ans;
  std::cout<<"Enter first number : ";
  std::cin>>fno;
    std::cout<<"Enter second number : ";
  std::cin>>sno;
  std::cout<<"Menu\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Remainder\n";
  std::cin>>ch;
  switch(ch)
  {
    case 1: std::cout<<fno+sno;
      break;
      case 2: std::cout<<fno-sno;
      break;
      case 3: std::cout<<fno*sno;
      break;
      case 4: std::cout<<fno/sno;
      break;
      case 5: std::cout<<fno%sno;
      break;
    default: std::cout<<"Invalid operation";
  }

}