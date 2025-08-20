class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        List<Integer> li = new ArrayList<>();
        Arrays.sort(nums);
        int sum = 0;
        int tot = find_sum(nums);
        for(int i=nums.length-1;i>=0;i--)
        {
            sum+=nums[i];
            li.add(nums[i]);
            int rest = tot-sum;
            if(sum > rest)
           {
               break;
           }
        }
        return li;
    }
    public int find_sum(int [] arr)
    {
        int sum = 0;
        for(int i=0;i< arr.length;i++)
        {
            sum+=arr[i];
        }
        return sum;
    }
}