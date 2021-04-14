#include <iostream>
#include <vector>
using namespace std;

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
