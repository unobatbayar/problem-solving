"""
We want to make a row of bricks that is goal inches long. We have a number of small bricks (1 inch each) and big bricks (5 inches each). Return True if it is possible to make the goal by choosing from the given bricks. This is a little harder than it looks and can be done without any loops. See also: Introduction to MakeBricks

make_bricks(3, 1, 8) → True
make_bricks(3, 1, 9) → False
make_bricks(3, 2, 10) → True

@author 
"""
def make_bricks(small, big, goal):
  overall_inches = small + big*5
  goal_even = goal%5
  goal_even_nosmall = goal%5 - small
  
  if overall_inches >= goal and goal%5 >= 0 and goal_even >= 0 and goal_even_nosmall <= 0:
    return True
  return False


