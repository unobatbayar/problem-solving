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

        ll numbers[length];
        ll maximum = 0;

        for (int i = 0; i < length; i++)
        {
            cin >> numbers[i];
            if(i == 0) continue;
                        
            ll result = numbers[i-1] * numbers[i];
            if(result > maximum) maximum = result;

        }
        cout << maximum << endl;
    }

    return 0;
}
