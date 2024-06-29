class Solution:
    def isPalindrome(self, s: str) -> bool:
        new = ""
        
        for c in s:
            if not c.isalnum:
                new += c.lower()

        print(new)
        return new == new[::-1]