#include <iostream>
using namespace std;

string find_winner(int w[]){
    if(w[0] > w[1]){
        return "Anton";
    }
    else if(w[1] > w[0]){
        return "Danik";
    }
    return "Friendship";
}

int main() {
    int n;
    cin >> n;

    string games;
    cin >> games;

    int w[2] = {0, 0};

    for(int i = 0; i<n; i++){
        if(games[i] == 'A') w[0]++;
        else w[1]++;
    }

    cout << find_winner(w) << endl;

    return 0;
}
