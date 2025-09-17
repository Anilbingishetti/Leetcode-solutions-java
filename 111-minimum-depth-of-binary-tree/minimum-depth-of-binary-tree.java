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
    public int minDepth(TreeNode root) {
        if(root == null)
        {
             return 0;
        }
        Queue<TreeNode> que = new LinkedList<>();
        int dep = 1;
        que.add(root);
        while(!que.isEmpty()){
            int s = que.size();
            for(int i=0;i<s;i++)
            {
                TreeNode temp = que.poll();
                if(temp.left == null && temp.right == null)
                {
                    return dep;
                }
                else{
                    if(temp.left!=null)que.add(temp.left);
                    if(temp.right!=null)que.add(temp.right);
                }
            }
            dep++;
        }
        return dep;
    }
}