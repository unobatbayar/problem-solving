# first attempt
class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        for c in s:
            new_s = s.replace(c, "")
            new_t = t.replace(c, "")
            if len(new_s) != len(new_t):
                return False
                
        return True

# another solution
class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        return sorted(s) == sorted(t)

# recent attempt (clean version)
class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        return self.count_characters(s) == self.count_characters(t)

    def count_characters(self, s: str) -> dict:
        char_count = {}
        for c in s:
            # https://www.w3schools.com/python/ref_dictionary_get.asp
            char_count[c] = char_count.get(c, 0) + 1
        return char_count
        
# optimized version
class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False

        count_s, count_t = {}, {}
        for i in range(len(s)):
            s_char, t_char = s[i], t[i]
            count_s[s_char] = count_s.get(s_char, 0) + 1
            count_t[t_char] = count_t.get(t_char, 0) + 1
        
        return count_s == count_t

        
