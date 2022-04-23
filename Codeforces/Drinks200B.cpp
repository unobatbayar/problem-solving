#include <iostream>  // std::cout, std::cin
using namespace std;
int main()
{
    int n;
    cin >> n;

    double volume_of_constituent = 0;
    int volume_of_all_constituents = n;

    while(n--){
        double p;
        cin >> p;
        volume_of_constituent += p;
    }

    double volume_fraction = volume_of_constituent/volume_of_all_constituents;
    cout << volume_fraction << endl;
    return 0;
}
