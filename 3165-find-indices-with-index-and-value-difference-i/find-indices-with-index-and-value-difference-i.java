class Solution {
    public int[] findIndices(int[] nums, int indexDifference, int valueDifference) {
        int [] ans = {-1,-1};
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i;j<nums.length;j++)
            {
                if(Math.abs(nums[i] - nums[j]) >= valueDifference && Math.abs(i-j) >= indexDifference)
                {
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
            }
        }
        return ans;
    }
}