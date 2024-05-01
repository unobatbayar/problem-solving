class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        numbers = set()
        for n in nums:
            if n in numbers:
                return True
            else:
                numbers.add(n)
        return False
