#include <iostream>
using namespace std;

void swap(int *x, int *y)
{
    int z = *x;
    *x = *y;
    *y = z;
}

int main() {
    int a = 10, b = 15;
    
    swap(&a, &b);
    
    cout << "a: " << a << " b: " << b;

    return 0;
}
