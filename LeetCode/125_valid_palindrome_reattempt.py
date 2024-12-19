class Solution:
    def isPalindrome(self, s: str) -> bool:
        new = ""

        for c in s:
            if c.isalpha() or c.isdigit():
                new += c.lower()

        print(new)
        return new == new[::-1]
