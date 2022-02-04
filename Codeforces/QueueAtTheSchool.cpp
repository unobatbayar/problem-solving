#include <iostream>
using namespace std;

int main() {
	   
    int total, seconds;
    
    cin >> total >> seconds;
    

    string queue;
    cin >> queue;
    
    while(seconds--){
        for(int i = 0; i<queue.length(); ++i){
            if(queue[i] == 'B' && queue[i+1] == 'G'){
                queue[i] = queue[i+1];
                queue[i+1] = 'B';
                ++i;
            }
        }
    }
    
    cout << queue;
    
	return 0;
}
