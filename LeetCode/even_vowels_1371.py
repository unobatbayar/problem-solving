# 1371. Find the Longest Substring Containing Vowels in Even Counts

class Solution:
    def findTheLongestSubstring(self, s: str) -> int:
        bitmask = 0
        max_length = 0
        seen = {0: -1} # bitmask 0 at index -1

        for i in range(len(s)):
            c = s[i]
            if c == 'a':
                bitmask ^= 1 << 0  # Flip the 0th bit for 'a'
            elif c == 'e':
                bitmask ^= 1 << 1  # Flip the 1st bit for 'e'
            elif c == 'i':
                bitmask ^= 1 << 2  # Flip the 2nd bit for 'i'
            elif c == 'o':
                bitmask ^= 1 << 3  # Flip the 3rd bit for 'o'
            elif c == 'u':
                bitmask ^= 1 << 4  # Flip the 4th bit for 'u'
            
            # Check if the current bitmask has been seen before
            if bitmask in seen:
                # Calculate the length of the valid substring
                max_length = max(max_length, i - seen[bitmask])
                #print(s[i:seen[bitmask]])
            else:
                # If it's the first time we see this bitmask, store the index
                seen[bitmask] = i
        return max_length
