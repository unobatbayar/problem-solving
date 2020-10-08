"""
Given an array of ints, return True if one of the first 4 elements in the array is a 9. The array length may be less than 4.


array_front9([1, 2, 9, 3, 4]) → True
array_front9([1, 2, 3, 4, 9]) → False
array_front9([1, 2, 3, 4, 5]) → False

@author unobatbayar

"""
def array_front9(nums):
  for x in range(0, len(nums)): #search for 9
    if nums[x] == 9 and x < 4:
      return True
  return False
