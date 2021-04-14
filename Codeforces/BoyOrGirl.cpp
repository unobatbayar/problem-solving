#include <iostream>
#include <unordered_map>
using namespace std;
 
int main() {
 
	string input;
	cin >> input;
	
    unordered_map<char, int> m; 
 
    for (int i = 0; i < input.length(); i++) { 
        m[input[i]]++; 
    } 
 
    int a = input.length() - (input.length() - m.size()); 
    if(a%2 == 0) cout << "CHAT WITH HER!";
    else cout << "IGNORE HIM!";
	return 0;
}
