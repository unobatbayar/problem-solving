/** 
 * @author unobatbayar 
 */
 
#include <iostream>
using namespace std;
 
int main()
{
    int price;
    cin >> price;

    int result = 0;
    

    for(int i = 0; i<price.length(); i++){
        price += price[i];
        price += price.substr(0, i);
        price += price.substr(price.length() - i, price.length());
    }
 
    cout << result - price << "\n";
 
 
    return 0;
}
