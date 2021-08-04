#include <iostream>  // std::cout, std::cin
#include <algorithm> // std::unique, std::distance, std::max
using namespace std;
using ll = long long;

ll solve(){
    ll friends;
    cin >> friends;
    if(friends < 6) return 15;
    else{
        return (friends/2)*5 + (friends%2 != 0 ? 5 : 0);
    }
}

int main()
{
    int tests;
    cin >> tests;
    while(tests--){
        cout << solve() << endl;
    }

    return 0;
}
