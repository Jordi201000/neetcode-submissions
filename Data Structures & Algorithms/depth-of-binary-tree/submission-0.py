# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def maxDepth(self, root: Optional[TreeNode]) -> int:
        loutput = 0
        routput = 0 
        if(root is None):
            return 0;
        if(root.left):
            loutput=self.maxDepth(root.left)

        if(root.right):
            routput=self.maxDepth(root.right)

        return 1+max(loutput,routput)