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
        int solution[number];
        bool possible;

        for(int i = 0; i <number; i++){
            cin >> weights[i];
        }

        for(int i = 0; i <number; i++){
            possible = true;
            int total = weights[i];
            solution[0] = weights[i];
            int counter = 1;
            for(int j = 0; j< number; j++){
                if(total == avoid){
                    possible = false;
                    break;
                }
                if(i == j) continue;
                total += weights[j];
                solution[counter] = weights[j];
                counter++;
            }
        }
        if(possible){
            cout << "YES" << endl;
            for(int i = 0; i<number; i++){
                cout << solution[i] << " ";
            }
            cout << endl;
        }
        else cout << "NO" << endl;
 
    }
 
 
    return 0;
}
