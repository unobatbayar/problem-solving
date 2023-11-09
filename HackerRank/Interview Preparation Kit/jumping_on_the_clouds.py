#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'jumpingOnClouds' function below.
#
# The function is expected to return an INTEGER.
# The function accepts INTEGER_ARRAY c as parameter.
#

def jumpingOnClouds(c):
    # Write your code here
    jumps = 0
    cloudCount = 0
    
    for cloud in c:
        if cloud == 0:
            cloudCount += 1
        elif cloud == 1:
            jumps += cloudCount//2 + 1
            cloudCount = 0

    if cloudCount != 0:
        jumps += cloudCount//2  
                      
    return jumps

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    n = int(input().strip())

    c = list(map(int, input().rstrip().split()))

    result = jumpingOnClouds(c)

    fptr.write(str(result) + '\n')

    fptr.close()
