#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {

    char *s;
    s = malloc(1024 * sizeof(char));
    scanf("%[^\n]", s);
    s = realloc(s, strlen(s) + 1);
    //Write your logic to print the tokens of the sentence here.
    int index = 0;
    while(s[index] != 0){
        if(isspace(s[index])) printf("\n");
        else printf("%c", s[index]);
        index++;
    }
    return 0;
}
