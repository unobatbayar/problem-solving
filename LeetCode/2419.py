class Solution:
    def longestSubarray(self, nums: List[int]) -> int:
        max_value = 0
        previous_value = 0

        max_occurence = 1
        occurence = 1

        for i in nums:
            if i > max_value:
                max_value = i
                max_occurence = 1

            if i == max_value:
                if max_value == previous_value:
                    occurence += 1
                else:
                    occurence = 1

                max_occurence = max(max_occurence, occurence)
            
            previous_value = i

        return max_occurence
