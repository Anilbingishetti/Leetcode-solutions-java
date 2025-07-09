class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        if(nums.length == k){
            return nums;
        }
        boolean [] dummy = new boolean [nums.length];
        List<Integer> li = new ArrayList<>();
        for(int i : nums)
        {
            li.add(i);
        }
        for(int i=0;i<k;i++)
        {
            int [] ref = find_ind(li);
            dummy[ref[0]] =  true;
            li.set(ref[0],Integer.MIN_VALUE);
        }
        int [] ans = new int [k];
        int j = 0;
       for (int i = 0; i < nums.length; i++) {
            if (dummy[i]) {
                ans[j++] = nums[i];
            }
       }
        return ans;
    }
    public int[] find_ind(List<Integer> li){
        int max = Integer.MIN_VALUE;
        int ind = -1;
        for(int i=0;i<li.size();i++)
        {
            if(li.get(i) > max)
            {
                max= li.get(i);
                ind = i;
            }
        }
        return new int[] {ind,max};
    }
}