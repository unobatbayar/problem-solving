#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'miniMaxSum' function below.
#
# The function accepts INTEGER_ARRAY arr as parameter.
#

def miniMaxSum(arr):
    # Write your code here
    arr.sort()
    minimum, maximum = 0, 0
    
    for i in range(0, 4):
        minimum += arr[i]
        maximum += arr[len(arr) - 1 - i]
        
    print(minimum, maximum)


if __name__ == '__main__':

    arr = list(map(int, input().rstrip().split()))

    miniMaxSum(arr)
