#include <iostream>

int main(){
	int num, k;
	
	std::cin>>k;
	for (int i = 1; i <= k; i++){
		for (int j = 0; j < i; j++){
			std::cout<<i;
          if(j!=(i-1))
          {
          	std::cout<<"*";
          }

        }
		std::cout<<"\n";
		num++;
	}
	
	num--;
	for (int i = k; i > 0; i--){
		for (int j = 0; j < i; j++){
			std::cout<<i;
          if(j!=(i-1))
          {
          	std::cout<<"*";
          }
		}
		std::cout<<"\n";
		num--;
	}
	
	return 0;
}