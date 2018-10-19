"""

Given a string, return a version without the first and last char, so "Hello" yields "ell". The string length will be at least 2.


without_end('Hello') → 'ell'
without_end('java') → 'av'
without_end('coding') → 'odin'

@author unobatbayar

"""

def without_end(str):
  first = str[1:len(str)-1]
  return first
