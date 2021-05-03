/** 
 * @author unobatbayar 
 */
#include <iostream>
#include <vector>
#include <sstream>
using namespace std;
 
int main()
{
    // Tests
    int tests;
    cin >> tests;
 
    while(tests--){
        int number, avoid;
        cin >> number >> avoid;
        int weights[number];
        bool possible = true;

        int total = 0;
        for(int i = 0; i <number; i++){
            cin >> weights[i];
            total += weights[i];
        }
        if(total == avoid){
            cout << "NO" << endl;
            continue;
        }
        // Solution exists
        cout << "YES" << endl;
        total = 0;
        for(int i = 0; i<number; i++){
            if(total + weights[i] == avoid){
                // swap
                swap(weights[i], weights[i+1]);
            }
            total += weights[i];
            cout << weights[i] << ' ';
    
        }
        cout << endl;
    }
 
 
    return 0;
}
