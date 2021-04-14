#include <iostream>
#include <unordered_map>
using namespace std;
 
int main() {
 
	int k, n, w;
	cin >> k >> n >> w;
	
	int total = k;
    for(int i = 2; i<w+1; i++){
        total += k*i;
    }
    
    if(total - n < 1) cout << 0;
    else cout << total - n;
}
