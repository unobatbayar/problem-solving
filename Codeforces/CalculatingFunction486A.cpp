#include <iostream>
using namespace std;
using ll = long long;

ll fn(ll n){
    if(n%2 == 0) return n/2;
    return -(n/2+1);
}

int main() {
    ll n;
    cin >> n;

    cout << fn(n) << endl;

	return 0;
}
