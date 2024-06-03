
#include <iostream>
#include <algorithm>
using namespace std;

int main()
{
    // Input 

    int n;
    int alice_rock, alice_scissor, alice_paper;
    int bob_rock, bob_scissor, bob_paper;

    // Output
    int minimum = 0, maximum = 0;

    cin >> n;
    cin >> alice_rock >> alice_scissor >> alice_paper;
    cin >> bob_rock >> bob_scissor >> bob_paper;

    maximum = min(alice_rock, bob_scissor) + min(alice_scissor, bob_paper) + min(alice_paper, bob_rock);

    // to do minimum



    cout << minimum << ' ' << maximum << endl;
    return 0;
}
