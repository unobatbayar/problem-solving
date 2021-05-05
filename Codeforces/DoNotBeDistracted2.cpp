#include <iostream>
#include <set>
using namespace std;

int main()
{
    // Tests
    int tests;
    cin >> tests;

    while(tests--){
        int n; 
        cin >> n;

        if(n < 10){
            cout << n << endl;
            continue;
        }
        cout << 8 + n/10 << endl;
        
    }


    return 0;
}
