#include <iostream>
#include <map>
using namespace std;

/**
 * @author code_report
 * https://www.youtube.com/watch?v=24VAm8gzWq4
 * 
 * 
 * Unordered set does not contain a duplicate element. 
 * Upon insertion, set automatically sorts it but it can be any order
 * 
 * Common methods
 * insert() O(log n) insert using make_pair
 * find() O(log n) returns pair
 * [] -> bracket operators O(log n) if values exists returns ref to value, otherwise, inserts.
 * size() O(1)
 * erase(val)
 **/

int main()
{
	map<int, int> m1;
	m1.insert(make_pair(20, 1)); // m = { (20, 1)}
	m1[20]++;  // m = {20, 2} 
	cout << m1[20] << endl;
	
	auto it = m1.find(20);
	cout << (it != m1.end() ? "found" : "not found") << endl;
	return 0;
}
