#include <iostream>
using namespace std;


int main() {
	int n;
	cin >> n;
	
	bool easy = true;
	
	while(n--){
	    int opinion;
	    cin >> opinion;
	    if(opinion == 1){
	        easy = false;
	        break;
	    }
	}
	
	if(easy) cout << "EASY" << endl;
	else cout << "HARD" << endl;
	
	return 0;
}
