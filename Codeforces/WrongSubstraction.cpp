#include <iostream>  // std::cout, std::cin
#include <bits/stdc++.h>
using namespace std;
using ll = long long;

ll tanya_algorithm(ll n){
    int last_digit = n%10;
    if(last_digit != 0) return n-1;
    return n/10;
}


int main()
{
    ll n;
    int k;

    cin >> n >> k;
    while(k--){
        n = tanya_algorithm(n);
    }
    cout << n;

}
