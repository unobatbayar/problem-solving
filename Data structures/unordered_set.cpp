#include <iostream>
#include <unordered_set>
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
 * insert() O(1)
 * find() O(1)
 * size() O(1)
 **/

int main()
{
	unordered_set<int> s1;
	s1.insert(30); // s = {30}
	s1.insert(10); // s = {10, 30}
	s1.insert(20); // s = {10, 20, 30}

	auto a = s1.find(30);
	cout << (a != s1.end() ? "found" : "nope") << endl; // found
	cout << s1.size(); // 3
	
	return 0;
}
