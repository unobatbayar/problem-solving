/** 
 * @author unobatbayar 
 */

#include <iostream>
using namespace std;

int main()
{
    // Tests
    int tests;
    cin >> tests;

    for (int i = 0; i < tests; i++)
    {
        int type, size;
        cin >> type >> size;

        bool readAll = false;

        for (int k = 0; k < type; k++)
        {
            int y, u, i, o;
            cin >> y >> u >> i >> o;

            if (u == i)
                readAll = true;
        }

        if (size % 2 != 0)
        {
            cout << "NO" << '\n';
        }
        else
        {
            if (readAll)
                cout << "YES" << '\n';
            else
                cout << "NO" << '\n';
        }
    }

    return 0;
}