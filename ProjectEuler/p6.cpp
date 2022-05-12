#include <iostream>
#include <cmath>
using namespace std;

int main() {
    int x = 0, y = 0;
    for(int i = 1; i<=100; ++i){
        x += pow(i, 2);
        y += i;
    }	
    y = pow(y, 2);
    
    cout << y - x;
	return 0;
}
