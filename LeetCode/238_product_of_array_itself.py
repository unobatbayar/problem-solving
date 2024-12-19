class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        first = []
        second = []

        length = len(nums)
        temp = nums[::-1]
        # first loop
        for i in range(0, length):
            if i == 0:
                first.append(nums[i])
                second.append(temp[i])
                continue
            first.append(first[i-1] * nums[i])
            second.append(second[i-1] * temp[i])

        second.reverse()

        ans = []
        # get final answer
        for i in range(0, length):
            # edge cases
            if i == 0:
                ans.append(second[i+1])
            elif i == length - 1:
                ans.append(first[i - 1])
            else:
                ans.append(first[i-1] * second[i+1])
        return ans