#include <iostream>
#include <algorithm>
using namespace std;

int main() {
    int arr_size;
    cin >> arr_size;
    
    int arr[arr_size];
    for(int i = 0; i<arr_size; ++i){
        cin >> arr[i];
    }
    
    sort(arr, arr + arr_size);
    
    
    for (int i = 0; i < arr_size; ++i){
        cout << arr[i] << " ";
    }
        
    return 0;
}
