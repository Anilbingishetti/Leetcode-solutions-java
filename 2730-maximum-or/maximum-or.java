class Solution {
    public long maximumOr(int[] nums, int k) {
        int n = nums.length;
        long [] prefix = new long [n];
        long [] suffix = new long [n];
        prefix[0] = nums[0];
        suffix[n-1] = nums[n-1];
        for(int i=1;i<n;i++)
        {
            prefix[i]=nums[i]|prefix[i-1];
        }
        for(int i=n-2;i>=0;i--)
        {
            suffix[i] = nums[i]|suffix[i+1];
        }
        long max = Long.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            long val = (long)nums[i] << k;
            long left = (i > 0) ? prefix[i - 1] : 0;
            long right = (i < n - 1) ? suffix[i + 1] : 0;
            max = Math.max(max,val|left|right);
        }
        return max;
    }
}