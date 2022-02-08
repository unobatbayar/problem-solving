#include <iostream>
using namespace std;

string correct(string s, string t){
    int length = s.size();
    for(int i = 0; i<length; ++i){
        if(s[i] != t[length-1-i]) return "NO";
    }
    
    return "YES";
}
int main() {
    string s;
    string t;

    cin >> s >> t;
    cout << correct(s, t) << endl;
    
    return 0;
}
