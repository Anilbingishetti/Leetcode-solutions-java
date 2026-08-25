class Solution {
    public int missingMultiple(int[] nums, int k) {
       Set<Integer>set = new HashSet<>();
       int len = nums.length;
       for(int i=0;i<len;i++)
       {
         set.add(nums[i]);
       }
       for(int i =1;;i++)
       {
           if(!set.contains(i*k))
           {
              return i*k;
           }
       }
    }
}