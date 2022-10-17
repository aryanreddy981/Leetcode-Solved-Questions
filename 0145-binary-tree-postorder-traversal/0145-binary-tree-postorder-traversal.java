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
//if ypu are not going to delete an element from linked list then declare arraylist otherwise linkedlist
// class Solution {
//     public List<Integer> postorderTraversal(TreeNode root) {
//         List<Integer> list=new ArrayList<>();
//         helper(root,list);
//         return list;
        
//     }
//     private void helper(TreeNode node,List<Integer> list){
//         if(node==null)
//             return;
//         helper(node.left,list);
//         helper(node.right,list);
//         list.add(node.val);
//     }
// }




//Iterative Approach
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
    LinkedList<Integer> ans=new LinkedList<>();
        Stack<TreeNode> stack=new Stack<>();
        if(root==null) return ans;
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode cur=stack.pop();
            ans.addFirst(cur.val);
            if(cur.left!=null){
                stack.push(cur.left);
            }
            if(cur.right!=null){
                stack.push(cur.right);
            }
            }
        return ans;
    }
            
        }
            