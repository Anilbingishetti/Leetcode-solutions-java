class Solution {
    public void moveZeroes(int[] nums) {
        int i =0;
        int j= 1;
        while(j < nums.length){
            if(nums[i] == 0 && nums[j]!=0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
            else if(nums[i]==0 && nums[j] == 0){
                j++;
            }
            else{
                i++;
                j++;
            }
        }
    }
}