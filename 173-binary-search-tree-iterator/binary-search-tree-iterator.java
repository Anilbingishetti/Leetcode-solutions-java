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
class BSTIterator {
    List<Integer> li;
    int ind;
    public BSTIterator(TreeNode root) {
        this.li = new ArrayList<>();
        this.ind = 0;
        dfs(root,li);
    }
    
    public int next() {
        ind++;
        return li.get(ind-1);
    }
    
    public boolean hasNext() {
        if(ind >=li.size())
        {
            return false;
        }
        return true;
    }
    public void dfs(TreeNode root,List<Integer> li){
    if(root == null)
    {
        return;
    }
    dfs(root.left,li);
    li.add(root.val);
    dfs(root.right,li);
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */