#include <iostream>
#include <unordered_map>
using namespace std;
 
int distinct(int n){
    while(true){
        n++;
        if(n%10 != (n/10)%10 != (n/100)%10 != (n/1000)%10) return n;
    }
    return 0;
    

}
int main() {
 
    int n = 1987;
    //cin >> year;

    cout << distinct(n);
    
    return 0;
}
