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
//steal=thing(money,jewellery)
// rob the bank and stole the money
class Solution {
    public int rob(TreeNode root) {
        int answer[]=helper(root);
           return Math.max(answer[0],answer[1]);
        
    }
    public int[] helper(TreeNode node){
        if(node==null)
            return new int[]{0,0};
        int[] left=helper(node.left);
        int right[]=helper(node.right);
        int rob=node.val + left[1] + right[1];
        int notRob=Math.max(left[0],left[1]) + Math.max(right[0],right[1]);
        return new int[] {rob,notRob};
    }
}