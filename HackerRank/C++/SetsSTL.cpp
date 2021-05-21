#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <set>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT 
      : Add an element  to the set.
  : Delete an element  from the set. (If the number  is not present in the set, then do nothing).
  : If the number  is present in the set, then print "Yes"(without quotes) else print "No"(without quotes).
  
  */   
  
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



