
#include <iostream>
#include <set>
using namespace std;


int main() {
    
    set<int> s;
    int buyMinimum = 0;

    for(int i = 0; i<4; ++i){
        int n;
        cin >> n;
        auto a = s.find(n);
    
        // we already have this color
        if(a != s.end()){
            ++buyMinimum;
        }
        // we don't have this color
        else{
            s.insert(n);
        }
    }
    
    cout << buyMinimum;
    
	return 0;
}
