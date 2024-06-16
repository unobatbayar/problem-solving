class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        for i in range (0, len(board)):
            numbers = set()
            for j in range(0, len(board[i])):
                num = board[i][j]
                if num == '.':
                    continue
                if num in numbers:
                    return False
                else:
                    numbers.add(num)
        return True