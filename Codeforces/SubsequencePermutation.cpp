#include <iostream>
#include <string>
#include <algorithm>

using namespace std;

int main()
{
    int tests;
    cin >> tests;

    while(tests--){
        int length;
        string s;

        cin >> length >> s;

        string sorted = s;
        sort(sorted.begin(), sorted.end());

        int k = 0;
        for(int i = 0; i < length; i++){
            if(s[i] != sorted[i]) k++;
        }

        cout << k << endl;
    
    }


    return 0;
}
