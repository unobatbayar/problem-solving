/**
 * Given an int array length 2, return true if it contains a 2 or a 3.

has23([2, 5]) → true
has23([4, 3]) → true
has23([4, 5]) → false

 */
public boolean has23(int[] nums) {
    if(nums[0] > 1 && nums[0] < 4) return true;
    if(nums[1] > 1 && nums[1] < 4) return true;
    return false;
    
   }
   