#include <iostream>
using namespace std;

string solve(string input){
    if(input.length() < 7) return "NO";
    
    int counter = 1;
    for(int i = 0; i<input.length(); i++){
        
        if(counter == 7) return "YES";
        
        if(input[i] == input[i+1]) counter++;
        else counter = 1;
    }
    
    return "NO";
}

int main() {
    
	string input;
	cin >> input;
	
    cout << solve(input);
	return 0;
}


