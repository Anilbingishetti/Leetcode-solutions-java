class Solution {
    public int findFinalValue(int[] nums, int original) {
        Set<Integer> set = new HashSet<>();
        for(int i : nums)
        {
            set.add(i);
        }
        for(int i=0;i<nums.length;i++)
        {
            if(set.contains(original)){
                original*=2;
            }
            else{
                break;
            }
        }
        return original;
    }
}