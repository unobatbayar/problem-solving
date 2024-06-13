class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        ans = []
        length = len(nums)

        # first loop
        ans.append(nums[0])
        for i in range(1, length):
            ans.append(nums[i-1] * nums[i])

        # second loop
        for i in range(0, length):
            ans[i] = i
        
        return ans