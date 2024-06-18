class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        rows = defaultdict(set) # x
        cols = defaultdict(set) # y 
        boxes = defaultdict(set)

        for r in range(0, len(board)):
            for c in range(0, len(board)):
                num = board[r][c]
                box = (r//3)*3 + (c//3)

                if num == '.':
                    continue

                if num in rows[r] or num in cols[c] or num in boxes[box]:
                    return False
                
                rows[r].add(num)
                cols[c].add(num)
                boxes[box].add(num)

        return True