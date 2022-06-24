/*
@author unobatbayar
*/
#include <iostream>
using namespace std;

int main()
{
    int layers;
    cin >> layers;

    string output = "";
    
    for(int i = 1; i<=layers; ++i){
        output += i%2 == 0 ? "I love " : "I hate "; 
        output += i == layers ? "it" : "that ";
    }

    cout << output;
}
