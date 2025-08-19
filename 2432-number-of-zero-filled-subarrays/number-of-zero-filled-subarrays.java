class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long c1= 0;
        long c2 =0;
        for(int i : nums)
        {
            if(i == 0)
            {
                c2++;
                c1+=c2;
            }
            else{
                c2 = 0;
            }
        }
        return c1;
    }
}