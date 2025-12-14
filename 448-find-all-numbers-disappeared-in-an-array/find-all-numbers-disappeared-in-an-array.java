class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> set = new HashSet<>();for(int i :nums){
            set.add(i);
        }
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(!set.contains(i+1)){
                ans.add(i+1);
            }
        }
        return ans;
    }
}