public boolean splitArray(int[] nums) {
    return checkEqualSum(0, nums, 0, 0);
  }
  
  public boolean checkEqualSum(int start, int[] nums, int one, int two){
    if(start >= nums.length) return one == two;
    
    return checkEqualSum(start + 1, nums, one + nums[start], two) || checkEqualSum(start + 1, nums, one, two + nums[start]);
  } 