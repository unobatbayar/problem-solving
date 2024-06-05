#!/bin/python3

import math
import os
import random
import re
import sys


#
# Complete the 'getMaxValue' function below.
#
# The function is expected to return an INTEGER.
# The function accepts INTEGER_ARRAY arr as parameter.
#

def getMaxValue(arr):
    arr.sort()
    arr[0] = 1
    
    for i in range(0, len(arr) - 1):
            compliment = arr[i+1] - arr[i]
            if compliment > 1:
                arr[i+1] = arr[i] + 1
    
    print(arr)
    return arr[len(arr) - 1]
        
        
    # Write your code here
if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    arr_count = int(input().strip())

    arr = []

    for _ in range(arr_count):
        arr_item = int(input().strip())
        arr.append(arr_item)

    result = getMaxValue(arr)

    fptr.write(str(result) + '\n')

    fptr.close()
