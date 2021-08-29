#include <iostream>  // std::cout, std::cin
#include <math.h>
#include <algorithm>
using namespace std;
using ll = long long;


ll solve(){
        ll a, b, c, d;
        cin >> a >> b >> c;

        ll diff = abs(a - b);
        d = c + diff;


        if(d == a || d == b){
            return -1;
        }

        ll four[] = {a, b, c, d};
        sort(four, four+4);
        if(abs(four[0] - four[1]) != abs(four[1] - four[2])) return -1;
        return d;
}

int main()
{
    int t;
    cin >> t;

    while(t--){
        cout << solve() << endl;
    }

}
