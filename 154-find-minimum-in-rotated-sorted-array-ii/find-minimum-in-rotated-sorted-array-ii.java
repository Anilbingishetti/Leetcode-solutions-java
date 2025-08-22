class Solution {
    public int findMin(int[] arr) {
        int low = 0;
        int high = arr.length-1;
        int min = Integer.MAX_VALUE;
        while(low <= high){
            int mid = low+(high-low)/2;
            if(arr[low] == arr[mid] && arr[mid] == arr[high])
            {
                 min = Math.min(min,arr[low]);
                 low++;
                 high--;
                 continue;
            }
            if(arr[low] <= arr[mid])
            {
                min = Math.min(arr[low],min);
                low = mid+1;
            }
            else{
                min = Math.min(arr[mid],min);
                high = mid-1;
            }
        }
        return min;
    }
}