#include <bits/stdc++.h>

using namespace std;



int main()
{
    int n;
    cin >> n;
    cin.ignore(numeric_limits<streamsize>::max(), '\n');
    
    int i = 1;
    while(i != 11){
        cout << n << " x " << i << " = " << n*i << '\n';
        i++;
    }
    return 0;
}
