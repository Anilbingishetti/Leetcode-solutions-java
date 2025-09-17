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
    public int sumRootToLeaf(TreeNode root) {
        List<String> ans = new ArrayList<>();
        dfs(root,new StringBuilder(),ans);
        int sum =0;
        for(String s : ans)
        {
           sum +=Integer.parseInt(s,2);
        }
        return sum;
    }
    public void dfs(TreeNode root,StringBuilder sb, List<String> li)
    {
        if(root == null)
        {
             return;
        }
        sb.append(root.val);
        if(root.left == null && root.right == null)
        {
            li.add(sb.toString());
        }else{
        dfs(root.left,sb,li);
        dfs(root.right,sb,li);
        }
        sb.deleteCharAt(sb.length()-1);
    }
}