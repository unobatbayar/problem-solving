"""

Given 2 int values, return True if one is negative and one is positive. Except if the parameter "negative" is True, then return True only if both are negative.


pos_neg(1, -1, False) → True
pos_neg(-1, 1, False) → True
pos_neg(-4, -5, True) → True

@author unobatbayar
"""
def pos_neg(a, b, negative):
  if negative == True:
    if a < 0 and b < 0:
      return True
  if negative == False:
    if a < 0 and b > 0 or a > 0 and b < 0:
      return True
  return False
