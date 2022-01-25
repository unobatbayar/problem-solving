#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */ 
    int tests;
    cin >> tests;
    while (tests--){
        string input;
        cin >> input;
        
        string even = "";
        string odd = "";
        
        for(int i = 0; i<input.length(); i++){
            if(i%2 == 0) even += input[i];
            else odd += input[i];
        }
        
        cout << even << " " << odd << endl;
    }  
    return 0;
}
