#include <iostream>
#include <string>
using namespace std;

int main() {
    // Complete the program
    string a, b;
    cin >> a >> b;
    
    cout << a.size() << " " << b.size() << '\n';
    cout << a << b << '\n';
    
    //swap first char
    char first = a[0];
    a[0] = b[0];
    b[0] = first;
    
    cout << a << " " << b;
    return 0;
}
