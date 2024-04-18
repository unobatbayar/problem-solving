class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        groups = {}

        for s in strs:
            total = [0] * 26
            for c in s:
                total[ord(c) - ord('a')]+=1
            
            total_tuple = tuple(total)

            if total_tuple in groups:
                groups[total_tuple].append(s)
            else:
                groups[total_tuple] = [s]

        return groups.values()
