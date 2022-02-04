#include <iostream>
using namespace std;

int main() {
	   
	int total_stops;
	cin >> total_stops;
	
	int max = 0;
	int passengers = 0;
	   
	while(total_stops--){
	    int exits, entries;
	    cin >> exits >> entries;
	    
	    passengers += entries - exits;
	    
	    if(passengers > max) max = passengers;
	}
	
	cout << max;
	
	return 0;
}
