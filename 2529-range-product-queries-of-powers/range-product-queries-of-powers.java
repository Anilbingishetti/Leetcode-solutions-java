class Solution {
    static final int MOD = 1_000_000_007;
    
    public int[] productQueries(int n, int[][] queries) {
        List<Integer> li = new ArrayList<>();
        get_powers(n, li);
        
        int[] ans = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            long pro = 1;
            for (int j = queries[i][0]; j <= queries[i][1]; j++) {
                pro = (pro * li.get(j)) % MOD;
            }
            ans[i] = (int) pro;
        }
        return ans;
    }
    
    public void get_powers(int n, List<Integer> li) {
        int bit = 0;
        while (n > 0) {
            if ((n & 1) == 1) {
                li.add(1 << bit);
            }
            bit++;
            n >>= 1;
        }
    }
}
