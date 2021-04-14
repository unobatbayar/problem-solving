/** 
 * @author unobatbayar 
 */

#include <iostream>
using namespace std;

int main()
{

    int n, k;
    cin >> n >> k;

    int p[n];
    
    int total = 0;

    for(int i = 0; i<n; i++){
        cin >> p[i];

    }
    for(int i = 0; i<n; i++){
        
        if(p[i] >= p[k-1] && p[i] > 0) total++;

    }

    
    cout << total;

    return 0;
}