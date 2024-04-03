# 75. Sort Colors
class Solution:
    def sortColors(self, nums: List[int]) -> None:
        swapped = True
        length = len(nums) - 1
        # the list is not yet fully sorted because swapping occurred
        while swapped:
            swapped = False
            for i in range(length):
                if nums[i] > nums[i+1]:
                    nums[i], nums[i+1] = nums[i+1], nums[i]
                    swapped = True
            # optimization since last element is now biggest
            length -= 1
