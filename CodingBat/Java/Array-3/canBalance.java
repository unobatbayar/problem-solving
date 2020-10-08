/*
@author unobatbayar

Given a non-empty array, return true if there is a place to split the array so that the sum of the numbers on one side is equal to the sum of the numbers on the other side.

canBalance([1, 1, 1, 2, 1]) → true
canBalance([2, 1, 1, 2, 1]) → false
canBalance([10, 10]) → true
*/

public boolean canBalance(int[] nums) {
    int left_sum = 0;
    int right_sum = 0;
    
    for(int i = 0; i<nums.length; i++){
      left_sum += nums[i];
      for (int k = i+1; k<nums.length; k++){
        right_sum += nums[k];
        if(k + 1 == nums.length){
            if(left_sum == right_sum) return true;
        }
      }
      right_sum = 0;
    }
    
    return false;
  }
  