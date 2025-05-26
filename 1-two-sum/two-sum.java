class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> li = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int find = target - nums[i];
            if(li.containsKey(find)){
                return new int [] {i, li.get(find)};
            }
            li.put(nums[i],i); 
        }
        return new int [] {-1,-1};
    }
}