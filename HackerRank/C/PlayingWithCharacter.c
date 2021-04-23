#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() 
{

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    char a;
    char b[15];
    char c[20];
    scanf("%c", &a);
    scanf("%s", &b);
    scanf("\n");
    scanf("%[^\n]%*c", &c);

    printf("%c\n", a);
    printf("%s\n", b);
    printf("%s\n", c);

    return 0;
}
