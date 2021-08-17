#include <iostream>  // std::cout, std::cin
#include <bits/stdc++.h> // includes all standard library
using namespace std;

int main()
{
    string sum;
    cin >> sum;

    int length = (sum.length() + 1)/2;
    int numbers[length];

    int count = 0;
    for(int i = 0; i<sum.length(); i++){
        if(sum[i] != '+'){
            numbers[count] = sum[i] - '0';
            count++;
        }
    }

    sort(numbers, numbers + length);

    for(int i = 0; i<length; i++){
        cout << numbers[i];
        if(i+1<length) cout << '+';
    }

    return 0;
}
