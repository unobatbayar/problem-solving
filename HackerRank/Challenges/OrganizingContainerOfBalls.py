# https://www.hackerrank.com/challenges/organizing-containers-of-balls
# This is a problem I've been given during job interview in 2019. Which I've failed to solve.

#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'organizingContainers' function below.
#
# The function is expected to return a STRING.
# The function accepts 2D_INTEGER_ARRAY container as parameter.
#

def organizingContainers(container):
    # Write your code here
    
    row, col = [0] * n, [0] * n
        
    for i in range(0, n):
        for j in range(0, n):
            row[i] += container[i][j]
            col[j] += container[i][j]
            
    # Sorting takes O(n log n) time while converting to set takes O(n) time. 
    return "Possible" if set(row) == set(col) else "Impossible"
    
    

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    q = int(input().strip())

    for q_itr in range(q):
        n = int(input().strip())

        container = []

        for _ in range(n):
            container.append(list(map(int, input().rstrip().split())))

        result = organizingContainers(container)

        fptr.write(result + '\n')

    fptr.close()
