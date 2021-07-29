#include <iostream>  // std::cout, std::cin
#include <algorithm> // std::unique, std::distance, std::max
using namespace std;

int main()
{
    int tests;
    cin >> tests;

    while (tests--)
    {
        int n, a, b;
        string s;
        cin >> n >> a >> b >> s;
        int m = unique(s.begin(), s.end()) - s.begin();

        cout << "What?: " << n * a << "Huh?: " << max(n * b, (m / 2 + 1) * b) << endl;
    }

    return 0;
}
