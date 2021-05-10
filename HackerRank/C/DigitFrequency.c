#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */ 
    int n[10] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    char c;
    
    while(scanf("%c", &c) == 1){
        int index = c - '0';
        n[index]++;
    }
    
    for(int i = 0; i<10; ++i){
        printf("%d ", n[i]);
    }
   
    return 0;
}
