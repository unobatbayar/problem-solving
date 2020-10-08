/*
Available at: https://leetcode.com/problems/rotate-array/

@author unobatbayar
*/

class Solution {
    public void rotate(int[] nums, int k) {
        int[] copy = Arrays.copyOf(nums, nums.length);
        for(int i = 0; i<nums.length; i++){
            int steps = i + k;
            nums[steps%nums.length] = copy[i];
        }
    }
    
}