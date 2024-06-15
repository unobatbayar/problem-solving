class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        for row in board:
            for element in row:
                print(element)
        return False