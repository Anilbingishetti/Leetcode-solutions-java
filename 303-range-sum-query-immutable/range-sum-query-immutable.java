class NumArray {
    int [] arr;
    public NumArray(int[] nums) {
      for(int i=1;i<nums.length;i++)
      {
        nums[i] +=nums[i-1];
      }
        this.arr = nums;
    }
    
    public int sumRange(int left, int right) {
        if(left == 0)
        {
            return arr[right];
        }
        return arr[right] - arr[left-1];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */