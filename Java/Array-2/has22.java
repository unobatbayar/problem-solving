/**
 * Given an array of ints, return true if the array contains a 2 next to a 2 somewhere.

has22([1, 2, 2]) → true
has22([1, 2, 1, 2]) → false
has22([2, 1, 2]) → false

@author unobatbayar
 */

public boolean has22(int[] nums) {
    for(int i = 0; i<nums.length; i++){
      if(nums[i] == 2){
        if(i<nums.length-1 && nums[i+1] == 2) return true;  
        if(i > 0 && nums[i-1] == 2) return true;  
      }
    }
    return false;
  }
  