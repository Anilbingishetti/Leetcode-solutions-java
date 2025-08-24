class Solution {
    public int longestSubarray(int[] nums) {
        int left = 0;
        int best =0;
        int zero = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] == 0)zero++;
            while(zero > 1)
            {
                if(nums[left]==0)zero--;
                left++;
            }
            best = Math.max(best,i-left);
        }
        return best;
    }
}