/*

Given a list of non-negative integers, return a list of those numbers multiplied by 2, omitting any of the resulting numbers that end in 2.

two2([1, 2, 3]) → [4, 6]
two2([2, 6, 11]) → [4]
two2([0]) → [0]

@author unobatbayar
*/

public List<Integer> two2(List<Integer> nums) {
    nums.replaceAll(n -> n * 2);
    nums.removeIf(n -> n%10 == 2);
    
    return nums;
  }
  