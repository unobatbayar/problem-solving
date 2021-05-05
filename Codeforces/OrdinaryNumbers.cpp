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
        int total = 0;
        
        if(n < 10){
            cout << n << endl;
            continue;
        }
        for(int i = 1; i<=n; ++i){
            
            bool ordinary = true;
            
            int s = i;
            int a = -1;
            while(s != 0){
                if(a != -1){
                    if(s%10 != a){
                    ordinary = false;
                    break;
                }
                }

                a = s%10;
                s = s/10;
            }
            if(ordinary) total++;
        }
        
        
        cout << total << endl;
    }


    return 0;
}
