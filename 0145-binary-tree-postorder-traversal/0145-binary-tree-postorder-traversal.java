/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;
        TreeNode prev = null;
        while(current != null || !stack.isEmpty()) 
        {
            while(current != null) 
            {
                stack.push(current);
                current = current.left;
            }
            TreeNode node = stack.peek();
            if(node.right != null && node.right != prev) 
            {
                current = node.right;
            } 
            else 
            {
                result.add(node.val);
                prev = stack.pop();
            }
        }
        return result;
    }
}