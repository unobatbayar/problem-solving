#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>


int main() 
{
    int a, b;
    scanf("%d\n%d", &a, &b);
  	// Complete the code.
    char numerics[9][6] = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for(int i = a; i<=b; i++){
            if(i <= 9) printf("%s %s", numerics[i-1], "\n");
            else{
                if(i%2 == 0) printf("%s %s", "even", "\n");
                else printf("%s %s", "odd", "\n");
            }
        }
    return 0;
}

