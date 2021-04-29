#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    int size;
    cin >> size;
    int arr[size];
    
    for(int i = 0; i<size; ++i){
        cin >> arr[i];
    }
    for(int i = 0; i<size; i++){
        cout << arr[size-1-i] << " ";
    }
    
    return 0;
}
