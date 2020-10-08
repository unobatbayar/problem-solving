/*
Given an array of ints, return true if the array contains a 2 next to a 2 or a 4 next to a 4, but not both.

either24([1, 2, 2]) → true
either24([4, 4, 1]) → true
either24([4, 4, 1, 2, 2]) → false

@author unobatbayar
beautiful and readable code practice
*/

public boolean either24(int[] nums) {
    boolean two_to_two = false;
    boolean four_to_four = false;
    
    //search
    for(int i = 0; i < nums.length-1; i++){
      if(nums[i] == 2 && nums[i+1] == 2) two_to_two = true;
      if(nums[i] == 4 && nums[i+1] == 4) four_to_four = true;
    }
    //match
    if(two_to_two && four_to_four) return false;
    if(!(two_to_two) && !(four_to_four)) return false;
    return true;
  }
