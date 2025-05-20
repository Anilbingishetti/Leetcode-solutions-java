class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++)
        {
            if(i == digit_sum(nums[i]))
            {
                return i;
            }
        }
        return -1;
    }
    public int digit_sum(int n)
    {
        int num = 0;
        while(n > 0)
        {
           num += n%10;
           n=n/10;
        }
        return num;
    }
}