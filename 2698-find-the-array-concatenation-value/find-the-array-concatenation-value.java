class Solution {
    public long findTheArrayConcVal(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        long sum = 0;
        int mid = nums.length /2;
        while(left < right){
            String s = Integer.toString(nums[left]) + Integer.toString(nums[right]);
            sum+=Integer.parseInt(s);
            left++;
            right--;
        }
        if(nums.length%2!=0)
        {
            sum+=nums[mid];
        }
        return sum;
    }
}