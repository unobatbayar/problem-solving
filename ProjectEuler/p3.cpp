#include <iostream>
#include <cmath>
using namespace std;

/**
The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143?

**/
int main() {
	// your code goes here
	double number = 600851475143;
	double largest_prime = 0;
	
	for(double i = 2; i<=number/2; i++){
	       if(fmod(number,i) == 0){
	            bool prime = true;
	            for(double k = 2; k<=i/2; k++){
	                if(fmod(i,k) == 0) prime = false;
	            }
	            if(prime){
	                cout << "prime found " << i << endl;
	                if(i > largest_prime) largest_prime = i;
	            }
	       }
	}
	cout << largest_prime;
	return 0;
}
