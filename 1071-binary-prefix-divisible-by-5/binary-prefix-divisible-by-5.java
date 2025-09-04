class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> li = new ArrayList<>();
        int n = 0;
        for(int i : nums)
        {
             n = (n*2+i)%5;
             li.add(n==0);
        }
        return li;
    }
}