class Solution {
    public long maximumTotalDamage(int[] power) {
        Map<Integer, Integer> hm = new HashMap<>();
        for (int damage : power) {
            hm.put(damage, hm.getOrDefault(damage, 0) + 1);
        }
        
        List<Integer> al = new ArrayList<>(hm.keySet());
        Collections.sort(al);
        
        int n = al.size();
        if (n == 0) return 0;
        long[] dp = new long[n];
        dp[0] = (long) al.get(0) * hm.get(al.get(0));
        
        for (int i = 1; i < n; i++) {
            long curr = (long) al.get(i) * hm.get(al.get(i));
            dp[i] = curr;

            int j = i - 1;
            while (j >= 0 && al.get(i) - al.get(j) <= 2) {
                j--;
            }
            
            if (j >= 0) {
                dp[i] += dp[j];
            }

            dp[i] = Math.max(dp[i], dp[i - 1]);
        }

        return dp[n - 1];
    }
}
