/** 
 * @author unobatbayar 
 */
 
#include <iostream>
using namespace std;
 
int main()
{
    long t; // test cases
    cin >> t;


    while(t--){
        long n, k;

        cin >> n >> k;

        long queries[n];
        long total = 0;
        bool cut_exists = false;
        
        for(int i = 0; i<n; i++){  
            cin >> queries[i];
            if(queries[i] < k){
                cut_exists = true;
            }
            total += queries[i];
        }

    
        if(cut_exists){
            int day = 1;
            for(int j = 0; j<sizeof(queries); j++){
                if((day == 1 && queries[j] < k) || (k > queries[j])){
                    break;
                }

                if(queries[j] >= k){
                    queries[j + 1] += queries[j] - k;
                    day++;
                }
            }
            total = day;
        }
        else{
             total = total/k + 1;
        }
        
       

        cout << total << "\n";
    }
    

 
    return 0;
}