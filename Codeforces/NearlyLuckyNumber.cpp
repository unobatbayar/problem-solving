    #include <iostream>
    using namespace std;

	#define ll long long
     
    bool lucky(int number){
        // single digit numbers
        if(number < 10){
            if(number != 4 && number != 7) return false;
        }
        
        // analyse each digit
        while(number > 0){
            int n = number%10;
            if(n != 4 && n != 7) return false;
            number/=10;
        }
        return true;    
    }
     
    int count(ll number){
        int total = 0;
        while(number > 0){
            int n = number%10;
            if(n == 4 || n == 7) ++total;
            number/=10;
        }
        
        return total;
    }
    int main() {
        ll n;
        cin >> n;

        int lucky_digits = count(n);

        if(lucky(lucky_digits)) cout << "YES" << endl;
        else cout << "NO" << endl;
        
    	return 0;
    }
