class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int max = 0;
        for(int i=0;i<nums.length;i++)
        {
            int temp = Math.max(incre(nums,i), desc(nums,i));
            max = Math.max(max,temp);
        }
        return max;
    }
    public int incre(int []arr, int ind){
        int count = 1;
        int ele = arr[ind];
        for(int i = ind+1;i<arr.length;i++)
        {
           if(arr[i] > ele)
           {
               ele = arr[i];
               count++;
           }
           else{
            break;
           }
        }
        return count;
    }
    public int desc(int []arr, int ind){
        int count = 1;
        int ele = arr[ind];
        for(int i = ind+1;i<arr.length;i++)
        {
           if(arr[i] < ele)
           {
               ele = arr[i];
               count++;
           }
           else{
            break;
           }
        }
        return count;
    }
}