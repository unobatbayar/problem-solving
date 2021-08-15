/** 
 * @author unobatbayar 
 */

#include <iostream>
#include <math.h>
using namespace std;

int solve(){
    int matrix[5][5];
    for(int i = 0 ; i<5; i++){
        for(int j = 0; j<5; j++){
            cin >> matrix[i][j];
            if(matrix[i][j] == 1){
                int a = abs(2 - i);
                int b = abs(2 - j);
                return a + b;
            }
        }
    }
    return 0;
}
int main()
{
    cout << solve();
    return 0;
}