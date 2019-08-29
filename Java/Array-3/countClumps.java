/*

Say that a "clump" in an array is a series of 2 or more adjacent elements of the same value. Return the number of clumps in the given array.

countClumps([1, 2, 2, 3, 4, 4]) → 2
countClumps([1, 1, 2, 1, 1]) → 2
countClumps([1, 1, 1, 1, 1]) → 1

@author unobatbayar

*/

public int countClumps(int[] nums) {
    int count = 0;
    int last = -1;
    
    for(int i = 0; i<nums.length-1; i++){
      if(nums[i] == nums[i+1]){
        if(nums[i] != last) count++;
      }
      
      last = nums[i];
    }
    
    return count;
    
  }
  