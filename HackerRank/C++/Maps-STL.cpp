#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <set>
#include <map>
#include <algorithm>
using namespace std;

int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */  
    int q;
    cin >> q;
    
    map<string, int> student;
    while(q--){
        int type;
        cin >> type;
        string name;
        cin >> name;
        auto it = student.find(name);
        if(type == 1){
            int grade;
            cin >> grade;
            if(it != student.end()) student[name]+= grade;  
            else student.insert(make_pair(name, grade));
        }
        else if(type == 2) student.erase(name);
        else if(type == 3){
            if(it != student.end()) cout << it->second << endl;
            else cout << 0 << endl; 
        }
    }

     
    return 0;
}



