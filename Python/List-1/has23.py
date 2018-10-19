"""

Given an int array length 2, return True if it contains a 2 or a 3.


has23([2, 5]) → True
has23([4, 3]) → True
has23([4, 5]) → False

@author unobatbayar

"""

def has23(nums):
  if 1 < nums[0] < 4 or 1 < nums[1] < 4:
    return True
  return False
