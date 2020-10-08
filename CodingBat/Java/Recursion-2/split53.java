/*

Given an array of ints, is it possible to divide the ints into two groups, so that the sum of the two groups is the same, with these constraints: all the values that are multiple of 5 must be in one group, and all the values that are a multiple of 3 (and not a multiple of 5) must be in the other. (No loops needed.)


split53([1, 1]) → true
split53([1, 1, 1]) → false
split53([2, 4, 2]) → true

@author unobatbayar
*/

public boolean split53(int[] nums) {
    return checkEqualSum(0, nums, 0, 0);
}
  
public boolean checkEqualSum(int start, int[] nums, int one, int two){
    if(start >= nums.length) return one == two;
    
    if(nums[start]%5 == 0) return checkEqualSum(start + 1, nums, one + nums[start], two);
    else if(nums[start]%3 == 0) return checkEqualSum(start + 1, nums, one , two + nums[start]);

    return checkEqualSum(start + 1, nums, one  + nums[start], two ) ||  checkEqualSum(start + 1, nums, one  , two + nums[start] );
}
