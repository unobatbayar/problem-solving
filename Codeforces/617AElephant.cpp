#include <iostream>
using namespace std;

int main() {
	
    int input;
    cin >> input;
	
    int a = input/5;
    if(input%5 > 0) a++;
    
    cout << a;
    return 0;
}


