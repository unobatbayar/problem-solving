/** 
 * @author unobatbayar 
 */

#include <iostream>
#include <string>
using namespace std;

int main()
{

    int n;
    cin >> n;
    int value = 0;

    for (int i = 0; i < n; i++)
    {
        string c;
        cin >> c;

        if (c.find("+") != -1)
            value++;
        if (c.find("-") != -1)
            value--;
    }

    cout << value;

    return 0;
}