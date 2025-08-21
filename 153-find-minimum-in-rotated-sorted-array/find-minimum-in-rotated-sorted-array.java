class Solution {
    public int findMin(int[] nums) {
        int l = 0;
        int r = nums.length-1;
        int min1 = 5001;
        while(l <= r)
        {
             int m =(l+r)/2;
             if(nums[l] <= nums[m])
             {
                 min1 = Math.min(nums[l],min1);
                 l = m+1;
             }
             else{
                  min1 = Math.min(nums[m],min1);
                  r = m-1;
             }
        }
        return min1;
    }
}