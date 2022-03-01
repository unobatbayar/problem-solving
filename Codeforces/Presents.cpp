#include <iostream>
#include <unordered_map>
using namespace std;

int main(){
    int n = 0;
    cin >> n;

    // using unordered map for O(1) complexity
    unordered_map<int, int> exchanges; 

    for(int i = 1; i<=n; ++i){
        int p = 0;
        cin >> p;
        exchanges.insert(make_pair(p, i));
    }

    for(int i = 1; i<=n; ++i){
        cout << exchanges[i] << endl;
    }
    
    return 0;
}