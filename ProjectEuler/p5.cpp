#include <iostream>
#include<string>  
using namespace std;

/**
2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
**/

int smallestNumber(int smallest){
    while(true){
        bool divisible = true;
        for(int i = 1; i<=20; i++){
            if(smallest%i != 0){
                divisible = false;
                break;
            }
        }
        if(divisible) return smallest;
        smallest++;
    }
}

int main() {
    cout << smallestNumber(20);
	return 0;
}