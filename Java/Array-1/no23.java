/**Given an int array length 2, return true if it does not contain a 2 or 3.

no23([4, 5]) → true
no23([4, 2]) → false
no23([3, 5]) → false
 */
public boolean no23(int[] nums) {
    if((nums[0] > 1 && nums[0] < 4) || (nums[1] > 1 && nums[1] < 4)) return false;
  
    return true;
  }
  