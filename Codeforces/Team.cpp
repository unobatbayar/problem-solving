/** 
 * @author unobatbayar 
 */

#include <iostream>
using namespace std;

int main()
{
    // Input
    int n;
    cin >> n;

    int total = 0;

    for(int i = 0; i < n; i++){
        int a, b, c;
        cin >> a >> b >> c;

        if((a + b + c) > 1) total++;
    }
    
    cout << total;

    return 0;
}