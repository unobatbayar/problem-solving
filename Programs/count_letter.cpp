/** 
 * @author erdenebold
 */

#include <iostream>
using namespace std;

int main() {
	// your code goes here
// 	cout << 'a' - 'a' << endl;
	string s = "erdene";
	int a[26] = {0};
	for(int i=0;i<s.size();i++) {
	    a[s[i] - 'a'] ++;
	}
	for(int i=0;i<26;i++) {
	    cout << 'a' + i << " " << a[i] << endl;
	}
	
	return 0;
}
