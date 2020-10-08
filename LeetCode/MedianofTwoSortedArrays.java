/*
There are two sorted arrays nums1 and nums2 of size m and n respectively.

Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).

You may assume nums1 and nums2 cannot be both empty.

Example 1:

nums1 = [1, 3]
nums2 = [2]

The median is 2.0

Example 2:

nums1 = [1, 2]
nums2 = [3, 4]

The median is (2 + 3)/2 = 2.5

Available at: https://leetcode.com/problems/median-of-two-sorted-arrays/
@author unobatbayar
*/

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int[] combined = new int[nums1.length + nums2.length];
        
        for(int i = 0; i<nums1.length; i++){
            combined[i] = nums1[i];
        }
        
        for(int i = 0; i<nums2.length; i++){
            combined[nums1.length+i] = nums2[i];
        }
        Arrays.sort(combined);
        
        //when length is even
        if((combined.length%2) == 0){
            double val1 = combined[combined.length/2 - 1];
            double val2 = combined[combined.length/2];
        
            return (val1 + val2)/2;
        }
        //when length is odd
        return combined[combined.length/2];

    }
    
}
