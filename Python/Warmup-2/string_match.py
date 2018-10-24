"""
Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring. So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings appear in the same place in both strings.

string_match('xxcaazz', 'xxbaaz') → 3
string_match('abc', 'abc') → 2
string_match('abc', 'axc') → 0

@author unobatbayar
"""
def string_match(a, b):
  counter = 0
  shortest = min(len(a), len(b))
  
  for x in range(0, shortest-1):
    a_two = a[x] + a[x+1] #using modulus would've been better a[i:i+2]
    b_two = b[x] + b[x+1] #using modulus would've been better a[i:i+2]
    if a_two == b_two:
      counter = counter + 1
  return counter
