# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def inorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        L = []
        if root == None:
            return []
        if root.left == None:
            L.append(root.val)
        else:
            L2 = self.inorderTraversal(root.left)
            L = L + L2
            L.append(root.val)
        if root.right != None:
            L3 = self.inorderTraversal(root.right)
            L = L + L3
        return L



        