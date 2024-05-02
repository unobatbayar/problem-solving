class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        count = {}
        for n in nums:
            count[n] = count.get(n, 0) + 1

        # https://www.w3schools.com/python/ref_func_sorted.asp
        sorted_count = [item[0] for item in sorted(count.items(), key=lambda item: item[1], reverse=True)]

        return sorted_count[:k]
        

        
