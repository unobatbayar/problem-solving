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
        ll length;
        cin >> length;

        if (length < 2)
        {
            int a = 0;
            cin >> a;
            return a;
        }

        ll max_n = 0;
        ll numbers[length];
        for (int i = 0; i < length; i++)
        {
            cin >> numbers[i];
        }

        for (int i = 0; i < length - 1; i++)
        {
            for (int k = 0; k < length - 1; k++)
            {
                // if (i == k)
                //     continue;

                ll maximum = max(numbers[i], numbers[i + 1]);
                ll minimum = min(numbers[k], numbers[k + 1]);

                ll result = maximum * minimum;
                if (result > max_n)
                    max_n = result;
            }
        }

        cout
            << max_n << endl;
    }

    return 0;
}
