#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    int length, sum = 0;
    scanf("%d", &length);
    int *arr = (int*)malloc(length * sizeof(int));
    for(int i = 0; i<length; i++){
        scanf("%d", &arr[i]);
        sum += arr[i];
    }
    free(arr);
    printf("%d", sum);
    return 0;
}
