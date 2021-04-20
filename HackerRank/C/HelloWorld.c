#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() 
{
	   /* Enter your code here. Read input from STDIN. Print output to STDOUT */    
    char s[100];
    fgets(s, sizeof(s), stdin);
    printf("Hello, World!\n");
    printf(s);
  	
    return 0;
}
