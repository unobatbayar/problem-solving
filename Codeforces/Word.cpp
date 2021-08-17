#include <iostream>  // std::cout, std::cin
using namespace std;

int main()
{
    string s;
    cin >> s;

    int total_upper = 0;
    int total_lower = 0;

    for(int i = 0; i<s.length(); i++){
        if(isupper(s[i])) total_upper++;
        else total_lower++;
    }

    for(int i = 0; i<s.length(); i++){
        s[i] = total_upper > total_lower ? toupper(s[i]) : tolower(s[i]);
    }

    cout << s;

}
