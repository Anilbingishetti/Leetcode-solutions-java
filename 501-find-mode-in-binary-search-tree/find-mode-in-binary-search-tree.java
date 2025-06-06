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
    public int[] findMode(TreeNode root) {
        List<Integer> li = new ArrayList<>();
        inorder(root,li);
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : li){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int max = Integer.MIN_VALUE;
        for(int i : map.keySet()){
            max = Math.max(max,map.get(i));
        }
        List<Integer> arr1 = new ArrayList<>();
        for(int i : map.keySet()){
            if(map.get(i) == max)
            arr1.add(i);
        }
        int [] arr = new int [arr1.size()];
        int j = 0;
        for(int i : arr1){
            arr[j++] = i;
        }
        return arr;
    }
    public void inorder(TreeNode root, List<Integer> li)
    {
        if(root == null){return;}
        inorder(root.left,li);
        li.add(root.val);
        inorder(root.right,li);
    }
}