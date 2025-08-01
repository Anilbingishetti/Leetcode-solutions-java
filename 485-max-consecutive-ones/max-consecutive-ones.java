class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = -1;
        int count = 0;
        for(int i : nums)
        {
            if(i==1){
                count++;
            }
            else{
                max = Math.max(max,count);
                count = 0;
                continue;
            }
        }
        max = Math.max(max,count);
        return max;
    }
}