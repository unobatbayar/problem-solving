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
        ll p;
        cin >> p;

        if (p < 4)
            continue;
        for (int b = 3; b <= p; b++)
        {
            if (p % 2 == p % b)
            {
                cout << 2 << ' ' << b << endl;
                break;
            }
        }
    }

    return 0;
}