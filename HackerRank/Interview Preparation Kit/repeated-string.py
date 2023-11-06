#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'repeatedString' function below.
#
# The function is expected to return a LONG_INTEGER.
# The function accepts following parameters:
#  1. STRING s
#  2. LONG_INTEGER n
#

def repeatedString(s, n):
    occurrence = s.count("a")
    repetitions = n//len(s)
    
    total = occurrence*repetitions
    
    if(n >  repetitions*len(s)):
        difference = n - repetitions*len(s)
        shortage = s[:difference].count("a")
        total += shortage
        
    return total;
    

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    s = input()

    n = int(input().strip())

    result = repeatedString(s, n)

    fptr.write(str(result) + '\n')

    fptr.close()
