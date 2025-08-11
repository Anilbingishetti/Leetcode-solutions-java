class Solution {
    public int maxProduct(int[] nums) {
        if(nums.length == 1)
        {
            return nums[0];
        }
        int max = 0;
        for(int i=0;i<nums.length;i++)
        {
            int pro= 1;
            for(int j=i;j<nums.length;j++)
            {
                if(nums[j] == 0)
                {
                    break;
                }
                 pro*=nums[j]; 
                 max = Math.max(max,pro);
            }
        }
        return max;
    }
}