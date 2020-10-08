/*
For each multiple of 10 in the given array, change all the values following it to be that multiple of 10, until encountering another multiple of 10. So {2, 10, 3, 4, 20, 5} yields {2, 10, 10, 10, 20, 20}.

tenRun([2, 10, 3, 4, 20, 5]) → [2, 10, 10, 10, 20, 20]
tenRun([10, 1, 20, 2]) → [10, 10, 20, 20]
tenRun([10, 1, 9, 20]) → [10, 10, 10, 20]

@author unobatbayar
*/
public int[] tenRun(int[] nums) {
    int current_multiple = 0; //current multiple of ten to change to
    boolean found = false; //found multiple of ten; current_multiple is no longer null
    
    for(int i = 0; i<nums.length; i++){
      if(nums[i]%10 == 0){
        current_multiple = nums[i];
        found = true;
      }
      else if(found) nums[i] = current_multiple;
    }
    return nums;
  }
  