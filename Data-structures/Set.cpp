#include <iostream>
#include <set>
using namespace std;

int main()
{
	set<int> s1;
	s1.insert(10);
	s1.insert(20);

	auto a = s1.find(30);
	cout << (a != s1.end() ? "found" : "nope");
	return 0;
}
