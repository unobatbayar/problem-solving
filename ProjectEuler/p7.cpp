#include <iostream>
#include <cmath>
using namespace std;

bool IsPrime(int n)
{
    if (n == 2 || n == 3){
        cout << "2 or 3 found, prime number." << endl;
        return true;
    }
        
    if (n <= 1 || n % 2 == 0 || n % 3 == 0){
        cout << "0 or 1 or even or divisible by 3 number found " << endl;
        return false;
    }

    for (int i = 5; 25 <= n; i += 6){
        cout << "Checking " << i << endl;
        
        if (n % i == 0 || n % (i + 2) == 0)
            return false;
    }

    return true;
}


int main() {
	int target = 10001;
	int count = 0;
	int number = 2;
		
	while(true){
	    if(IsPrime(number)) count++;
	    
	    if(count == target){
	        cout << "Found: " << number << endl;
	        break;
	    }
	    number++;
	}    

	return 0;
}
