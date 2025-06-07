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
    public boolean isCousins(TreeNode root, int x, int y) {
        List<Integer> li = new ArrayList<>();
        Queue<TreeNode>q1 = new LinkedList<>();
        Queue<TreeNode>q2 = new LinkedList<>();
        q1.add(root);
        while(!q1.isEmpty()){
            TreeNode temp = q1.poll();
            li.add(temp.val);
            if(temp.left!=null){q2.add(temp.left);}
            if(temp.right!=null){q2.add(temp.right);}
            if(q1.isEmpty()){
                Queue<TreeNode> t = q1;
                q1 = q2;
                q2 = t;
                System.out.print(li);
            if((li.contains(x)&& li.contains(y)) &&(findParent(root,x,-1) != findParent(root,y,-1))){
                return true;
            }
            else{
                li.clear();
            }
        }
            }
        return false;
    }
   public  int findParent(TreeNode root, 
                          int target, int parent) {
      
        if (root == null) {
            return -1;
        }

        // If current node is the target, 
        // return its parent
        if (root.val == target) {
            return parent;
        }

        // Recursively search in left subtree
        int leftSearch = findParent(root.left,
                                    target, root.val);
  
        if (leftSearch != -1) {
            return leftSearch;
        }

        // Recursively search in right subtree
        return findParent(root.right, target, root.val);
    }

}