/*
Return an array that is "left shifted" by one -- so {6, 2, 5, 3} returns {2, 5, 3, 6}. You may modify and return the given array, or return a new array.

shiftLeft([6, 2, 5, 3]) → [2, 5, 3, 6]
shiftLeft([1, 2]) → [2, 1]
shiftLeft([1]) → [1]
@author unobatbayar
*/

public int[] shiftLeft(int[] nums) {
    if(nums.length < 2) return nums;
    int temp = nums[0];
    
    //6,2,5,3 -> 2,5,3,3 
    for(int i = 0; i<nums.length-1; i++){
      nums[i] = nums[i+1]; 
    }
    //fix last integer 2,5,3,6
    nums[nums.length-1] = temp;
    return nums;
  }
  