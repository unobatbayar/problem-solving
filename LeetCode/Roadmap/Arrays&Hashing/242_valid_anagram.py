# first attempt
class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False

        for c in s:
            if c in t:
                new_s = s.replace(c, "")
                new_t = t.replace(c, "")
                if len(new_s) != len(new_t):
                    return False
            else:
                return False

        return True
        
