"""


Given three ints, a b c, return True if one of b or c is "close" (differing from a by at most 1), while the other is "far", differing from both other values by 2 or more. Note: abs(num) computes the absolute value of a number.


close_far(1, 2, 10) → True
close_far(1, 2, 3) → False
close_far(4, 1, 3) → True

@author unobatbayar

"""
def close_far(a, b, c):
  diff_ab = abs(a - b)
  diff_bc = abs(b - c)
  diff_ac = abs(a - c)
  if diff_ab <= 1 and diff_bc >= 2 and diff_ac >= 2:
    return True
  elif diff_bc <= 1 and diff_ab >= 2 and diff_ac >= 2:
    return True
  elif diff_ac <= 1 and diff_ab >= 2 and diff_bc >= 2:
    return True 
  return False
