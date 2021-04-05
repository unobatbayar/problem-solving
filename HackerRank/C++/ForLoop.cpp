#include <iostream>
#include <cstdio>
using namespace std;

int main() {
    // Complete the code.
    int start, end;
    cin >> start >> end;
    string numerics[9] = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    for(int i = start; i<=end; i++){
        if(i <= 9) cout << numerics[i-1] << '\n';
        else{
            if(i%2 == 0) cout << "even" << '\n';
            else cout << "odd" << '\n';
        }
    }
    return 0;
}
