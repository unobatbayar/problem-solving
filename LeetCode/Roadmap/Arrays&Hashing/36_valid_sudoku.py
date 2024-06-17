class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        for y in range (0, len(board)):
            row_nums, col_nums = set(), set()

            for x in range(0, len(board)):
                row = board[y][x]
                col = board[x][y]
                # check row
                if row != '.':
                    if row in row_nums:
                        return False
                else:
                    row_nums.add(row)
                # check col
                if col != '.':
                    if col in col_nums:
                        return False
                else:
                    col_nums.add(col)
        return True