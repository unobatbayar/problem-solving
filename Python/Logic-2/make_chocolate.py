"""

We want make a package of goal kilos of chocolate. We have small bars (1 kilo each) and big bars (5 kilos each). Return the number of small bars to use, assuming we always use big bars before small bars. Return -1 if it can't be done.


make_chocolate(4, 1, 9) → 4
make_chocolate(4, 1, 10) → -1
make_chocolate(4, 1, 7) → 2

@author unobatbayar
"""

def make_chocolate(small, big, goal):
  if big >= goal/5: #check if we have enough big bricks
    diff = goal - (goal/5)*5
    if small >= diff: #have enough small bricks to do the difference
      return diff
  else:
    diff = goal - big*5
    if small >= diff:
      return diff
  return -1