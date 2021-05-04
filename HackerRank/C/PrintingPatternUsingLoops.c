#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() 
{

    int n;
    scanf("%d", &n);
    int len = n * 2 - 1;
    int a[len][len];
    int start = 0, end = len - 1;
  
    while(n--){
        for(int i = start; i<=end; i++){
            for(int j = start; j<=end; j++)
            {
                if(i == start || j == start || i == end || j == end){
                    a[i][j] = n+1;
                }
            }
        }
        start++;
        end--;
    }
    
    for(int i = 0; i<len; i++){
        for(int j = 0; j<len; j++)
        {
            printf("%d ", a[i][j]);
        }
        printf("\n");
    }

  	// Complete the code to print the pattern.
    return 0;
}
