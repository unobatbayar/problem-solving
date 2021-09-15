#include <iostream>
#include <set>

using namespace std;
 
int distinct(int n){
    set<int> visited;
    int temp = n;

    while(temp > 0){
        if(visited.count(temp%10)){
            return distinct(n+1);
        }
        visited.insert(temp%10);
        temp/=10;
    }

    return n;
}

int main() {
 
    int year;
    cin >> year;
    cout << distinct(year+1);
    
    return 0;
}
