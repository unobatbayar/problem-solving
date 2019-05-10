/*
Given an array length 1 or more of ints, return the difference between the largest and smallest values in the array. Note: the built-in Math.min(v1, v2) and Math.max(v1, v2) methods return the smaller or larger of two values.

bigDiff([10, 3, 5, 6]) → 7
bigDiff([7, 2, 10, 9]) → 8
bigDiff([2, 10, 7, 2]) → 8

@author unobatbayar
*/

public int bigDiff(int[] nums) {
    int smallest = nums[0];
    int largest = nums[0];
    
    for(int i = 0; i<nums.length; i++){
      smallest = Math.min(smallest, nums[i]);
      largest = Math.max(largest, nums[i]);
    }
    
    return largest - smallest;
  }
  