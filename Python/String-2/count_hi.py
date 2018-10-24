"""
Return the number of times that the string "hi" appears anywhere in the given string.

count_hi('abc hi ho') → 1
count_hi('ABChi hi') → 2
count_hi('hihi') → 2

@author unobatbayar
"""

def count_hi(str):
  count = 0
  for x in range(0, len(str)-1):
    if str[x] == 'h'and str[x+1] == 'i':
        count += 1
  return count

