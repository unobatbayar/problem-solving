# recursive + memoization Time O(n) Space O(n)
class Solution:
    def climbStairs(self, n: int) -> int:
        return self.solve(n, {})

    def solve(self, n: int, memo: {}):
        if n in memo:
            return memo[n]
        if n <= 3:
            return n
        memo[n] = self.solve(n - 1, memo) + self.solve(n - 2, memo)
        return memo[n]


# memoryless (iterative with constant space): Time O(n) Space O(1)
class Solution:
    def climbStairs(self, n: int) -> int:
        if n <= 3:
            return n

        prev, cur = 2, 3
        for _ in range(4, n + 1):
            prev, cur = cur, cur + prev
        return cur
