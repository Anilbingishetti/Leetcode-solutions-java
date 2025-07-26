class Solution {
    public int maxSum(int[] nums) {
        int max1 = Integer.MIN_VALUE;
        int max2 = 0;
        for(int i : nums)
        {
            max1 = Math.max(max1,i);
        }
        if(max1 < 0)
        {
            return max1;
        }
        int sum = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums)
        {
            if(i>=0 && !set.contains(i) && i >=0)
            {
                sum+=i;
                set.add(i);
                max2 = Math.max(sum,max2);
            }
        }
        return max2;
    }
}