/*
We'll say that a value is "everywhere" in an array if for every pair of adjacent elements in the array, at least one of the pair is that value. Return true if the given value is everywhere in the array.

isEverywhere([1, 2, 1, 3], 1) → true
isEverywhere([1, 2, 1, 3], 2) → false
isEverywhere([1, 2, 1, 3, 4], 1) → false
@author unobatbayar
*/

public boolean isEverywhere(int[] nums, int val) {
    if(nums.length < 2) return true; 
    
    int start = 0; 
    if(nums[1] == val) start = 1; 
    
    for(int i = start; i<nums.length; i+=2){
      if(nums[i] != val) return false;
    }
    return true;
  }
  