"""
Given a string, return a new string where the first and last chars have been exchanged.


front_back('code') → 'eodc'
front_back('a') → 'a'
front_back('ab') → 'ba'

@author unobatbayar

"""

def front_back(str):
  if len(str) == 1:
    return str
  elif len(str) > 1:
    array = list(str)
    array[0], array[len(str)-1] = array[len(str)-1], array[0]
    newstring = ""
    for x in array:
      newstring = newstring + x
    
    str = newstring
    return str
  else:
    return str

 