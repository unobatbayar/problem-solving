#include <iostream>  // std::cout, std::cin
#include <stdio.h>
#include <limits.h>
using namespace std;

int main()
{
    int tests;
    cin >> tests;

    while (tests--)
    {
        int length;
        cin >> length;
        int arr[length];
        int min = INT_MAX;
        for(int i = 0; i<length; i++){
            cin >> arr[i];
            for(int k = 0; k<i; k++){
                int and_operation = arr[i]&arr[k];
                if(and_operation < min) min = and_operation;
            }
        }
        cout << min << endl;
    }

    return 0;
}
