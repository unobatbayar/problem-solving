/** 
 * @author unobatbayar 
 */
 
#include <iostream>
using namespace std;
 
int main()
{
    int t; // test cases
    cin >> t;

    for(int i = 0; i<t; i++){

        int n; //denoting the number of cities, 
        int k; //the size of jumps, 
        int x; //Covid's current city, 
        int y; //and the city that you live in

        cin >> n >> k >> x >> y;

        bool found = false;
        
        if(y == x) found = true;
        else{
            for(int j = 0; j<n; j++){
                x = (x + k)%n;
                if(y == x){
                    found = true;
                    break;
                }
            }
        }        
            
        if(found) cout << "YES" << "\n";
        else cout << "NO" << "\n";
    }
 

 
    return 0;
}