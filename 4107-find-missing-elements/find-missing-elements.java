class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Set<Integer> set = new TreeSet<>();
        for(int i : nums){set.add(i);}
        List<Integer>l1 = new ArrayList<>(set);
        int small = l1.get(0);
        int large = l1.get(l1.size()-1);
        List<Integer> ans = new ArrayList<>();
        for(int i=small;i<=large;i++)
        {
            if(!set.contains(i))
            {
                ans.add(i);
            }
        }
        return ans;
    }
}