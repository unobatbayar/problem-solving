#include <iostream>
using namespace std;

bool ordinary(int n){
    int s = n;
    int a = -1;
    while(s != 0){
        if(a != -1){
            if(s%10 != a){
                return false;
            }
        }
        a = s%10;
        s = s/10;
    }
    return true;
}

int solve(int n){

    if(n < 10) return n;
    
    int counter = 0;
    while(n > 10){
        counter++;
        n = n/10;
    }

    return counter*9 + (n-1);
}

int main()
{
    int tests = 2;
    cin >> tests;

    while(tests--){
        int n; 
        cin >> n;

        cout << solve(n) << endl;
    }

    return 0;
}
