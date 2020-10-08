"""
Given an array of ints, return the number of 9's in the array.

array_count9([1, 2, 9]) → 1
array_count9([1, 9, 9]) → 2
array_count9([1, 9, 9, 3, 9]) → 3

@author unobatbayar
"""
def array_count9(nums):
  counter = 0
  for num in nums:
    if num == 9:
      counter += 1
  return counter

