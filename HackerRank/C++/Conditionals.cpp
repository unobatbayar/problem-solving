#include <bits/stdc++.h>

using namespace std;



int main()
{
    int n;
    cin >> n;
    cin.ignore(numeric_limits<streamsize>::max(), '\n');
    string number_words[9] = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    
    if(n <= 9) cout << number_words[n-1];
    else cout << "Greater than 9";
    
    // Write Your Code Here

    return 0;
}
