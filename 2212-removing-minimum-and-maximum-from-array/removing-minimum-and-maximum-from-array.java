class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        int max_ind = -1;
        int min = Integer.MAX_VALUE;
        int min_ind = -1;
        for(int i=0;i<n;i++)
        {
             if(nums[i] > max)
             {
                 max = nums[i];
                 max_ind = i;
             }
             if(nums[i] < min)
             {
                 min = nums[i];
                 min_ind = i;
             }
        }
         
        int f =  Math.max(min_ind, max_ind) + 1;
        int b =  n - Math.min(min_ind, max_ind);
        int option1 = (min_ind + 1) + (n - max_ind);
        int option2 = (max_ind + 1) + (n - min_ind);
        return Math.min(Math.min(f,b),Math.min(option1, option2));
    }
}