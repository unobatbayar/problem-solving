#include <iostream>
#include <vector>
using namespace std;

/**
 * @author code_report
 * https://www.youtube.com/watch?v=24VAm8gzWq4
 * 
 * Common methods
 * push_back()  O(1)
 * [] -> bracket operators O(1)
 * size() O(1)
 **/
int main()
{

	vector<int> v1;
	v1.push_back(10);
	v1.push_back(20);
	for (int i = 0; i < v1.size(); i++)
	{
		cout << v1[i] << endl;
	}

	cout << "vector size: " << v1.size();
	return 0;
}
