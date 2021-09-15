#include <iostream>
#include <set>
using namespace std;

/**
 *  * @author code_report
 * https://www.youtube.com/watch?v=24VAm8gzWq4
 * 
 * 
 * Set does not contain a duplicate element. 
 * Upon insertion, set automatically sorts it
 * 
 * Common methods
 * insert() O(log n)
 * find() O(log n)
 * size() O(1)
 **/

int main()
{
	set<int> s1;
	s1.insert(30); // s = {30}
	s1.insert(10); // s = {10, 30}
	s1.insert(20); // s = {10, 20, 30}

	auto a = s1.find(30);
	cout << (a != s1.end() ? "found" : "nope") << endl; // found
	cout << s1.size(); // 3
	
	return 0;
}
