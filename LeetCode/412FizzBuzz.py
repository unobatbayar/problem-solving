class Solution:
    def fizzBuzz(self, n: int) -> List[str]:
        answer = []
        for i in range (1, n+1):
            ans = ""
            if i%3 == 0:
                ans = "Fizz"
            if i%5 == 0:
                ans += "Buzz"
            if not ans:
                ans = str(i)
            answer.append(ans)
        return answer
