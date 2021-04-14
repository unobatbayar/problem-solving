/** 
 * @author unobatbayar 
 */

#include <iostream>
#include <string> 
using namespace std;

int main()
{
    string first;
    string second;
    
     cin >> first >> second;

    for(int i = 0; i<first.length(); i++){
        first[i] = tolower(first[i]);
        second[i] = tolower(second[i]);
    } 
    
    if(first < second) cout << "-1";
    else if(first > second) cout << "1";
    else cout << "0";

    return 0;
}