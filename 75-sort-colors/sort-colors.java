class Solution {
    public void sortColors(int[] nums) {
        quicksort(nums,0,nums.length-1);
    }
    public void quicksort(int []arr, int low, int high){
        if(low < high)
        {
            int pi = part(arr,low,high);
            quicksort(arr,low,pi-1);
            quicksort(arr,pi+1,high);
        }
    }
    private int part(int []arr, int low, int high){
        int pi = arr[high];
        int i = low-1;
        for(int j=low;j<high;j++)
        {
           if(arr[j] < pi)
           {
               i++;
               int temp = arr[i];
               arr[i] = arr[j];
               arr[j] = temp;
           }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return i+1;
    }
}