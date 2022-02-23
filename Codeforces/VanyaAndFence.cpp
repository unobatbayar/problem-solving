#include <iostream>
using namespace std;

int main(){
    int friends = 0, height = 0, width = 0;
    cin >> friends >> height;

    while(friends--){
        int i = 0;
        cin >> i;
        width += i > height ? 2 : 1;
    }

    cout << width;
    
    return 0;
}