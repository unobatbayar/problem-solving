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
        int n, a;
        cin >> n >> a;
 
        if(n == 1 || n == 2){
            cout << 1 << '\n';;
            continue;
        }
        
        n -= 2;
        int ret = n / a;
        if (n % a != 0) ret ++;
        cout << ret + 1 << endl;
 
    }
 
 
    return 0;
}