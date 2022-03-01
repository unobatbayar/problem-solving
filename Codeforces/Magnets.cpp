#include <iostream>
using namespace std;

int main(){
    int n = 0, counter = 1;
    cin >> n;

    char last = ' ';
    
    while(n--){
        string pole;
        cin >> pole;
        if(last == ' '){
            last = pole[0];
        }
        else{
            if(last != pole[0]) counter++;
            last = pole[0];
        }
    }    
    cout << counter << endl;
    return 0;
}