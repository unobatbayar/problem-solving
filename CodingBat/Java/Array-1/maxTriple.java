/**
 * Given an array of ints of odd length, look at the first, last, and middle values in the array and return the largest. The array length will be a least 1.

maxTriple([1, 2, 3]) → 3
maxTriple([1, 5, 3]) → 5
maxTriple([5, 2, 3]) → 5

 */
public int maxTriple(int[] nums) {
    int middle = nums.length/2;
    return Math.max(Math.max(nums[0], nums[nums.length-1]), nums[middle]);
  }
  