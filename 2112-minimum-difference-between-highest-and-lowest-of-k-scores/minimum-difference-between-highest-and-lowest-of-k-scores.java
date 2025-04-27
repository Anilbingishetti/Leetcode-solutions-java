class Solution {
    public int minimumDifference(int[] nums, int k) {
        if( k == 1){
            return 0;
        }
        Arrays.sort(nums);
        int ans = Integer.MAX_VALUE;
        for(int i=0;i<=nums.length-k;i++)
        {
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for(int j=i;j<i+k;j++)
            {
                max = Math.max(max,nums[j]);
                min = Math.min(min,nums[j]);
            }
            ans = Math.min(ans,max-min);
        }
        return ans;
    }
}