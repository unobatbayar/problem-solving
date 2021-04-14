/** 
 * @author unobatbayar 
 */

#include <iostream>
using namespace std;

int main()
{
    int a;
    cin >> a;
    bool possible = false;

    for(int i = 1; i<a; i++){
        int b = a - i;
        if(b%2 == 0 && i%2 == 0) {
            possible = true;
            break;
        }
    }

    if(possible) cout << "YES";
    else cout << "NO";
}
