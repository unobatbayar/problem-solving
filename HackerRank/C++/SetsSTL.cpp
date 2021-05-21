#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <set>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
  
    int q;
    cin >> q;
    set<int> s1;
    
    while(q--){
        int x; 
        int y;
        cin >> x >> y;
        
        switch(x){
            case 1:
                s1.insert(y);
                break;
            case 2:
                s1.erase(y);
                break;
            case 3:
                auto a = s1.find(y);
                cout << (a != s1.end() ? "Yes" : "No") << endl;
                break;
        }
            
    }
    
    return 0;
    
}



