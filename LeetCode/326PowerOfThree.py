class Solution:
    def isPowerOfThree(self, n: int) -> bool:
        if n <= 0:
            return False
            
        a = 1
        while a < n:
            a *= 3
        
        return a == n
