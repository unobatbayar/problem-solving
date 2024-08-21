#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'timeConversion' function below.
#
# The function is expected to return a STRING.
# The function accepts STRING s as parameter.
#

def timeConversion(s):
    # Write your code here
    parts = s.split(':')
    hour = int(parts[0])
    if "AM" in s:
        if hour >= 12:
            new = hour - 12
            return "0" + str(new) + s[2:-2]
        return s[:-2]
    
    if hour != 12:
        new = hour + 12
        return str(new) + s[2:-2]
    return s[:-2]
    
if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    s = input()

    result = timeConversion(s)

    fptr.write(result + '\n')

    fptr.close()
