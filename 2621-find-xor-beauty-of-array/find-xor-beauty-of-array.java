class Solution {
    public int xorBeauty(int[] nums) {
        int ans = 0;
        for(int i : nums)
        {
            ans^=i;
        }
        return ans;
    }
}