class Solution {
    public int largestAltitude(int[] gain) {
        int [] arr = new int [gain.length+1];
        int sum =0;
        arr[0] = 0;
        for(int i=0;i<gain.length;i++)
        {
            sum+=gain[i];
            arr[i+1] = sum;
        }
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
}