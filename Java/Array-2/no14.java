/**
Given an array of ints, return true if it contains no 1's or it contains no 4's.


no14([1, 2, 3]) → true
no14([1, 2, 3, 4]) → false
no14([2, 3, 4]) → true

@author unobatbayar
**/

public boolean no14(int[] nums) {
  HashSet<Integer> numSet = new HashSet<Integer>();
  for(int i = 0; i<nums.length; i++) numSet.add(nums[i]);
  
  return (!numSet.contains(1) || !numSet.contains(4));
}
