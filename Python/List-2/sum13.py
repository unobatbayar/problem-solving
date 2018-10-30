"""

Return the sum of the numbers in the array, returning 0 for an empty array. Except the number 13 is very unlucky, so it does not count and numbers that come immediately after a 13 also do not count.


sum13([1, 2, 2, 1]) → 6
sum13([1, 1]) → 2
sum13([1, 2, 2, 1, 13]) → 6

@author unobatbayar
"""
def sum13(nums):
  sum = 0
  found = False
  reset = 0
  for i in range(0, len(nums)):
    if reset == 0:
      found = False
    if nums[i] == 13:
      sum = sum
      found = True
      reset = 1
    else:
      if found == False:
        sum = sum + nums[i]
      reset = 0
  return sum
