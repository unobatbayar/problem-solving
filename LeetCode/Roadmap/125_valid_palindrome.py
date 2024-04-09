class Solution:
    def isPalindrome(self, s: str) -> bool:
        filtered = ""
        for c in s:
            if c.isalnum():
                filtered+= c.lower()
        return filtered == filtered[::-1]
