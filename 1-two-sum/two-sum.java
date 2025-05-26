class Solution {
    public int[] twoSum(int[] nums, int target) {
        List<Integer> li = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int find = target - nums[i];
            if(li.contains(find)){
                return new int [] {i, li.indexOf(find)};
            }
            li.add(nums[i]); 
        }
        return new int [] {-1,-1};
    }
}