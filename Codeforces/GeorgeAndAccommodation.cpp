#include <iostream>
using namespace std;

int main(){
    int n = 0, p = 0, q = 0, a = 0;
    cin >> n;

    while(n--){
        cin >> p >> q;
        if(q - p >= 2) a++;
    }

    cout << a;
    
    return 0;
}