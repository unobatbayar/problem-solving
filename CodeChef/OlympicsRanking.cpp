#include <iostream>  // std::cout, std::cin
#include <algorithm> // std::unique, std::distance, std::max
using namespace std;

int main()
{
    int tests;
    cin >> tests;

    while (tests--)
    {
        int one;
        int two;
        for(int i = 0; i<6; i++){
            int temp; 
            cin >> temp;
            if(i < 3) one+= temp;
            else two+= temp;
        }
        cout << (one > two ? '1' : '2') << endl;
    }

    return 0;
}
