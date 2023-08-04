def evenZigZag(nums: []) -> int:
    moves = 0
    print(nums)
    for i in range(len(nums) - 1):
        if i%2 == 0:
            if(nums[i] <= nums[i+1]):
                diff = abs(nums[i] - nums[i+1]) + 1
                nums[i+1] = nums[i+1] - diff
                moves += diff
        else:
            if(nums[i] >= nums[i+1]):
                diff = abs(nums[i] - nums[i+1]) + 1
                nums[i] = nums[i] - diff
                moves += diff
    return moves

def oddZigZag(nums: []) -> int:
    moves = 0
    print(nums)
    for i in range(len(nums) - 1):
        if i%2 == 0:
            if(nums[i] >= nums[i+1]):
                diff = abs(nums[i] - nums[i+1]) + 1
                nums[i] = nums[i] - diff
                moves += diff
        else:
            if(nums[i] <= nums[i+1]):
                diff = abs(nums[i] - nums[i+1]) + 1
                nums[i+1] = nums[i+1] - diff
                moves += diff
    print(moves)                
    return moves
class Solution:
    def movesToMakeZigzag(self, nums: []) -> int:
        return min(evenZigZag(nums[:]), oddZigZag(nums[:]))
