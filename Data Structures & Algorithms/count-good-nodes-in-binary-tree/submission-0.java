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
    public int goodNodes(TreeNode root) {
        return dfs(root , Integer.MIN_VALUE);
    }
    private int dfs(TreeNode node , int max){
        int cnt  = 0;

        if(node == null) return cnt;

        if(node.val >= max){
            cnt= 1;
            max = node.val;
        }

        cnt += dfs(node.left , max);
        cnt += dfs(node.right , max);

        return cnt;
    }
}
