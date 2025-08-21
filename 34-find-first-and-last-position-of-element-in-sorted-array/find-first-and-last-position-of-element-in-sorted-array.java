class Solution {
    public int[] searchRange(int[] nums, int target) {
         int fi = lower_bound(nums,target);
         if(fi == -1|| nums[fi]!=target)
         {
            return new int[] {-1,-1};
         }
         int sec = upper_bound(nums,target)-1;
         return new int[] {fi,sec};
    }
    public int lower_bound(int []arr, int t)
    {
        int ans = arr.length;
        int left = 0;
        int right = arr.length-1;
        while(left <= right)
        {
            int mid = (left+right)/2;
            if(arr[mid] >= t)
            {
                ans = mid;
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        if(ans == arr.length)
        {
            return -1;
        }
        return ans;
    }
    public int upper_bound(int []arr, int t)
    {
        int ans = arr.length;
        int left = 0;
        int right = arr.length-1;
        while(left <= right)
        {
            int mid = (left+right)/2;
            if(arr[mid] > t)
            {
                ans = mid;
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        return ans;
    }
}