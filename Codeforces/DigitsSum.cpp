#include <iostream>  // std::cout, std::cin
#include <algorithm> // std::unique, std::distance, std::max
using namespace std;
using ll = long long;

int main()
{
    int tests;
    cin >> tests;
    while (tests--)
    {
        ll x;
        cin >> x;

        // Right most bit -> tests[i]%10
        // Left most bit -> tests[i]/10
        ll right = x % 10;
        ll left = x / 10;

        if (right >= 9)
            left++;

        cout << left << endl;
    }

    return 0;
}
