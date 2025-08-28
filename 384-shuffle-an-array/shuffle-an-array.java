class Solution {
    int [] arr1;
    int [] arr2;
    public Solution(int[] nums) {
        this.arr1 = nums.clone();
        this.arr2 = nums.clone();
    }
    
    public int[] reset() {
        return arr2;
    }
    
    public int[] shuffle() {
        Random rand =new Random();
         int i = rand.nextInt(0,arr1.length-1);
             int t = arr1[i];
             arr1[i] = arr1[i+1];
             arr1[i+1] = t;
         return arr1;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */