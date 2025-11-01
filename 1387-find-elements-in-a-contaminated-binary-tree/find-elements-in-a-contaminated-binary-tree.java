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
class FindElements {
    public static List<Integer> li;
    public FindElements(TreeNode root) {
        this.li = new ArrayList<>();
        get_values(root,li,0);
    }
    
    public boolean find(int target) {
        return li.contains(target);
    }
    public void get_values(TreeNode root,List<Integer> li, int ind)
    {
         if(root == null)
         {
            return ;
         }
         li.add(ind);
         get_values(root.left,li,(ind*2)+1);
         get_values(root.right,li,(ind*2)+2);
    }
}

/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */