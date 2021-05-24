#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
#include <cassert>
using namespace std;

/*Write the class AddElements here*/
template <class T>
class AddElements
{
    public:T element;
    AddElements(T arg){
        element=arg;
    }
    
    T add(T x){
        return element+x;
    }
    T concatenate(T x){
        return element + "" + x;
    }
    
};
int start_up() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    return 0;
}

int static r = start_up();

#define endl '\n';

int main () {
