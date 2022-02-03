#include <iostream>
using namespace std;

int main() {
	int length;
	cin >> length;
	
	int total = 0;
	
	// to return
	char current = ' ';
	
    while(length--){
        
        // get input
        char input;
        cin >> input;
        
        // main logic
        if(current == input) total++;
        else {
            current = input;
        }   
    }
    
    cout << total << endl;
    return 0;
}
