"""
Return the sum of the numbers in the array, except ignore sections of numbers starting with a 6 and extending to the next 7 (every 6 will be followed by at least one 7). Return 0 for no numbers.


sum67([1, 2, 2]) → 5
sum67([1, 2, 2, 6, 99, 99, 7]) → 5
sum67([1, 1, 6, 7, 2]) → 4

@author unobatbayar

This was much harder than it looks, excuse my bad code, 
did it to finish everything fast.
Improvement coming soon.
"""
def sum67(nums):
  sum = 0
  canAdd = True
  foundSix = False
  
  for num in nums:
    if num == 6:
      canAdd = False
      foundSix = True
    elif num == 7:
      canAdd = True
      if foundSix == False:
        sum = sum + num
      else:
        foundSix = False
    else:
      if canAdd == True:
        sum = sum + num
          
  return sum