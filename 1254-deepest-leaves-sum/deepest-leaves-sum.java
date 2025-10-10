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
    public int deepestLeavesSum(TreeNode root) {
        List<Integer> li = bfs(root);
        int sum =0;
        System.out.print(li);
        for(int i:li)
        {
             sum+=i;
        }
        return sum;
    }
    public List<Integer> bfs(TreeNode root)
    {
        if(root == null)
        {
            return new ArrayList<>();
        }
        Queue<TreeNode> q1 = new LinkedList<>();
        Queue<TreeNode> q2 = new LinkedList<>();
        List<Integer> li = new ArrayList<>();
        List<List<Integer>> master = new ArrayList<>();
        q1.add(root);
        while(!q1.isEmpty())
        {
            TreeNode temp = q1.poll();
            li.add(temp.val);
            if(temp.left!=null)q2.add(temp.left);
            if(temp.right!=null)q2.add(temp.right);
            if(q1.isEmpty())
            {
                master.add(new ArrayList<>(li));
                li.clear();                
                q1 = q2;
                q2 = new LinkedList<>();
            }
        }
        return master.get(master.size()-1);
    }
}