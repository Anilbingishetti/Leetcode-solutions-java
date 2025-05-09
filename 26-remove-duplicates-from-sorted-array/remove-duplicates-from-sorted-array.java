class Solution {
    public int removeDuplicates(int[] nums) {
        int ind = 1;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]!=nums[ind-1])
            {
               nums[ind] = nums[i];
               ind++;
            }
        }
        return ind;
    }
}