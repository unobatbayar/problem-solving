/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
@author unobatbayar
We can use nested forloops but to find better time and space complexity, we use HashMap 
since we also must retrive the data after checking if it contains.
*/
class Solution {
    public int[] twoSum(int[] nums, int target) {
        //Create Hashmap to store all complements
        Map<Integer, Integer> complements = new HashMap<Integer, Integer>();
        
        for(int i = 0; i<nums.length; i++){
    
            int complement = target - nums[i];
            //solution found
            if(complements.containsKey(complement)){
              return new int[] { complements.get(complement), i};
            } 
            //add i with key nums[i]
            complements.put(nums[i], i);
        }
        //no solution
        return new int[] {};
    }
}