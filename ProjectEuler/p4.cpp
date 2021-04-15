#include <iostream>
#include<string>  
using namespace std;

/**
A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.
**/
bool isPalindromic(int value){
    string number = to_string(value);
    for(int i = 0; i<number.length(); i++){
        if(number[i] != number[number.length()-(i + 1)]) return false;
    }
    return true;
}


int main() {
    int max = 0;

    for(int i = 100; i<1000; i++){
        for(int k = 100; k<1000; k++){
            if(isPalindromic(i*k)){
                if(i*k > max) max = i*k;
            }
        }
    }

    cout << max;
	return 0;
}