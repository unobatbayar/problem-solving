"""

Given 2 strings, return their concatenation, except omit the first char of each. The strings will be at least length 1.


non_start('Hello', 'There') → 'ellohere'
non_start('java', 'code') → 'avaode'
non_start('shotl', 'java') → 'hotlava'

@author unobatbayar

"""
def non_start(a, b):
  first = a[1:]
  last = b[1:]
  return first + last