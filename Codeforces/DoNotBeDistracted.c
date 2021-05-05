#include <iostream>
#include <set>
using namespace std;

int main()
{
    // Tests
    int tests;
    cin >> tests;

    while(tests--){
        int length;
        cin >> length;
        set<char> s1;
        bool sus = true;
        char previous = 'x';
        
        for(int i = 0; i<length; ++i){
            char a;
            cin >> a;
            if(a == previous) continue;
            
            if(s1.find(a) != s1.end()){
                sus = false;
                break;
            }
            s1.insert(a);
            previous = a;
        }
        if(sus) cout << "YES" << endl;
        else cout << "NO" << endl;
    }


    return 0;
}
