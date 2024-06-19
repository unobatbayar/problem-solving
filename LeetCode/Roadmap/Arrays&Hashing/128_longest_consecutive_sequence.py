class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        nums.sort()

        longest = 0
        count = 0

        if len(nums) == 0:
            return 0
        elif len(nums) == 1:
            return 1

        return 0
