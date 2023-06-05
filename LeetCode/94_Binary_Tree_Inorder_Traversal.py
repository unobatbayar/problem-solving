# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def dfs(self, root: Optional[TreeNode]):
        if root is not None:
            self.dfs(root.left)
            self.visited.append(root.val)    
            self.dfs(root.right)
        return
    
    def inorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        self.visited = []  # Initialize the visited list
        self.dfs(root)
        return self.visited