#include <iostream>
#include <unordered_map>
using namespace std;

/**
 *  * @author code_report
 * https://www.youtube.com/watch?v=24VAm8gzWq4
 * 
 * Stores in any order, faster than Map but methods are same
 * 
 * Common methods
 * insert() O(1)
 * find() O(1)
 * [] -> bracket operator O(1)
 * size() O(1) 
 **/

int main() {
    
	unordered_map<int, int> m1;
	m1.insert(make_pair(20, 1)); // m = { (20, 1)}
	m1[20]++;  // m = {20, 2} 
	cout << m1[20] << endl;
	
	auto it = m1.find(20);
	cout << (it != m1.end() ? "found" : "not found") << endl;
	return 0;
}


