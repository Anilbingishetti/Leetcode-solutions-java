class Solution {
    public int[] transformArray(int[] nums) {
        int first = 0;
        int last = nums.length-1;
        int ans[] = new int [nums.length];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2 == 0)
            {
                ans[first++] = 0;
            }
            else{
                ans[last--] = 1; 
            }
        }
        return ans;
    }
}