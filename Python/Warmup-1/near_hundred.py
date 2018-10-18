"""

Given an int n, return True if it is within 10 of 100 or 200. Note: abs(num) computes the absolute value of a number.


near_hundred(93) → True
near_hundred(90) → True
near_hundred(89) → False

@author unobatbayar

"""
def near_hundred(n):
    near_ten = abs(100 - n)
    near_ten2 = abs(200 - n)
    if near_ten <= 10:
      return True
    elif near_ten2 <= 10:
      return True
    return False

