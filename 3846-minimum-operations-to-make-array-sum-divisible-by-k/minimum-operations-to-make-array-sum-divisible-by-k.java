class Solution {
    public int minOperations(int[] nums, int k) {
        int sum = 0;
        for(int i : nums)
        {
            sum+=i;
        }
        if (sum < k)
        return sum;
        if(sum > k)
        return sum%k;
        return 0;
    }
}