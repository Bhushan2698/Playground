#include <iostream>

int main(){
	int num, k=4;
	
	std::cin>>num;
	for (int i = 1; i <= k; i++){
		for (int j = 0; j < i; j++){
			std::cout<<num;
		}
		std::cout<<"\n";
		num++;
	}
	
	num--;
	for (int i = k; i > 0; i--){
		for (int j = 0; j < i; j++){
			std::cout<<num;
		}
		std::cout<<"\n";
		num--;
	}
	
	return 0;
}