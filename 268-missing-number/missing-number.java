class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        int t_sum = 0;
        for(int i=0;i<nums.length;i++)
        {
          sum+=nums[i];
          t_sum+=(i+1);
        }
        return t_sum-sum;
    }
}