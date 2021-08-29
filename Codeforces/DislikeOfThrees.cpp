#include <iostream>  // std::cout, std::cin
using namespace std;

int main()
{
    int t;
    cin >> t;
    int polycarps[1000];

    int counter = 0;
    for(int i = 0; i<1667; i++){
        if(i%3 == 0) continue;
        if(i%10 == 3) continue;
        polycarps[counter] = i;
        counter++;
    }

    while(t--){
        int k;
        cin >> k;

        cout << polycarps[k] << endl;
    }

}
