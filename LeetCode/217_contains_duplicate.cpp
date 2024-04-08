class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        seenWords = set()
        for num in nums:
            if num in seenWords:
                return True
            else:
                seenWords.add(num)
