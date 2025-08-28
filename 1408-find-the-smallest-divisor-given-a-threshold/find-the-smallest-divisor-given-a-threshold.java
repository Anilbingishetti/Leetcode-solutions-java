class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1;
        int high = find_max(nums);
        while(low <= high)
        {
             int mid = (low+high)/2;
             int ans = find(nums,mid);
             if(ans > threshold)
             {
                 low = mid+1;
             }
             else{
                  high = mid-1;
             }
        }
        return low;
    }
    public int find(int []arr, int div){
        int tot = 0;
        for(int i : arr){
            tot+=(int)Math.ceil((double)i/div);
        }
        return tot;
    }
    public int find_max(int [] arr)
    {
        int max = -1;
        for(int i : arr)
        {
            max = Math.max(i,max);
        }
        return max;
    }
}