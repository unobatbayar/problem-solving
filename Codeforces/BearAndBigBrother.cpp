/** 
 * @author unobatbayar 
 */
#include <iostream>
using namespace std;

int solve(int limak, int bob){
    if(limak > bob) return 0;
    return 1 + solve(limak*3, bob*2);
}

int main()
{
    int limak, bob;
    cin >> limak >> bob;

    cout << solve(limak, bob);
    return 0;
}
