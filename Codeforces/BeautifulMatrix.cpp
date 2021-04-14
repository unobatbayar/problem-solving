/** 
 * @author unobatbayar 
 */

#include <iostream>
#include <string>
using namespace std;

int main()
{
    int matrix[5][5];
    int moves = 0;

    for(int i = 0 ; i<5; i++){
        for(int j = 0; j<5; j++){
            cin >> matrix[i][j];
            if(matrix[i][j] == 1){
                // Logic here   
            }
        }
    }


    cout << matrix[1][4];

    return 0;
}