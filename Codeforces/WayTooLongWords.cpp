/** 
 * @author unobatbayar 
 */

#include <iostream>
using namespace std;

int main()
{
    int n;
    cin >> n;

    string words[n];

    for(int i = 0; i<n; i++){
        cin >> words[i];

        if(words[i].length() > 10){
            cout << words[i].substr(0, 1) << (words[i].length() - 2) << words[i].substr(words[i].length() - 1, words[i].length()) << '\n';
        }
        else{
            cout << words[i] << '\n';
        }
    }


    return 0;
}