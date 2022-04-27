#include <iostream>
using namespace std;

int main() {
	
    string n1, n2;
    cin >> n1 >> n2;
    
    for(int i = 0; i<n1.size(); ++i){
        // XOR operation
        cout << (n1[i] ^ n2[i]);
    }
    
    return 0;
}
