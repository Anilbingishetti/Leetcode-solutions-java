class Solution {
    public int[] fairCandySwap(int[] a, int[] b) {
        int t1 = 0;
        int t2 =0;
        for(int i : a)
        {
             t1+=i;
        }
        HashSet<Integer> set = new HashSet<>();
        for(int i : b)
        {
             t2+=i;
             set.add(i);
        }
        int avg = (t2-t1)/2;
        int [] ans = new int [2];
        for(int i : a)
        {
             if(set.contains(i+avg))
             {
                  ans[0] = i;
                  ans[1] = i+avg;
             }
        }
        return ans;
    }
}