class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        Set<Integer> set = new HashSet<>();
        for(int i : friends)
        {
            set.add(i);
        }
        int [] ans = new int [set.size()];
        int j=0;
        for(int i : order)
        {
             if(set.contains(i))
             {
                ans[j++] = i;
             }
        }
        return ans;
    }
}