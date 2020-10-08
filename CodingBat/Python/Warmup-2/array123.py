"""
Given an array of ints, return True if the sequence of numbers 1, 2, 3 appears in the array somewhere.

array123([1, 1, 2, 3, 1]) → True
array123([1, 1, 2, 4, 1]) → False
array123([1, 1, 2, 1, 2, 3]) → True

@author unobatbayar
"""

def array123(nums):
  for x in range(0, len(nums)-2): # -2 because we're adding x + 2 and it will exceed
    if nums[x] == 1 and nums[x+1] == 2 and nums[x+2] == 3:
      return True
  return False

