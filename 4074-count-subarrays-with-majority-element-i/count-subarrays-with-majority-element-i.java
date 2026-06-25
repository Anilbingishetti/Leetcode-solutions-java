class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int len = nums.length;
        int [] dsl = nums;
        int [] arr = new int [len+1];
        arr[0] = 0;
        for(int i=0;i<len;++i)
            {
                arr[i+1] = arr[i] + (dsl[i] == target ? 1 : -1);
            }
        int [] arr1 = new int [len+1];
        long ans = slove(arr,arr1,0,len);
        return (int) ans;
    }
    public long slove(int [] arr, int[]arr1, int left, int right)
    {
        if(left >= right)return 0;
        int mid = (left+right) >> 1;
        long k = slove(arr,arr1,left,mid) + slove(arr,arr1,mid+1,right);
        int r = mid+1;
        for(int i=left;i<=mid;i++)
            {
                while(r <= right && arr[r] <= arr[i]){
                    r++;
                }
                k+=(right-r+1);
            }
        int x = left;
        int y = mid+1; 
        int z = left;
        while(x <= mid && y<=right){
            if(arr[x] <= arr[y]){
                arr1[z++] = arr[x++];
            }
            else{
                arr1[z++] = arr[y++];
            }
        }
        while(x <= mid){
            arr1[z++] = arr[x++];
        }
        while(y <= right){
            arr1[z++] = arr[y++];
        }
        for(int i=left;i<=right;i++)
            {
                arr[i] = arr1[i];
            }
        return k;
    }
}