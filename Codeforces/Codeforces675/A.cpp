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
 
    for(int i = 0; i<tests; i++){
        int a, b, c;
        cin >> a >> b >> c;

        int total = 0;
        if(a == 1){
            total = 10 - a - b - c;
        }
        else{
            total = a*a - a - b - c;
        }

        cout << total << "\n";
    }
 
 
    return 0;
}
