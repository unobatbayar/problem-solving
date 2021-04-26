#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>
//Complete the following function.


void calculate_the_maximum(int n, int k) {
    int max_and = 0, max_or = 0, max_xor = 0;
    for(int i = 1; i<n; ++i){
        for(int j = 1 + i; j <= n; ++j){
            if(((i&j) > max_and) && ((i&j) < k)) max_and = i&j;
            if(((i|j) > max_or) && ((i|j) < k)) max_or = i|j;
            if(((i^j) > max_xor) && ((i^j) < k)) max_xor = i^j;
        }
    }
  //Write your code here.
  printf("%d\n", max_and);
  printf("%d\n", max_or);
  printf("%d\n", max_xor);
}

int main() {
    int n, k;
  
    scanf("%d %d", &n, &k);
    calculate_the_maximum(n, k);
 
    return 0;
}
