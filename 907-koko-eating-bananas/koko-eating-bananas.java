class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int low = 1;
        int high = piles[piles.length-1];
        while(low <= high)
        {
             int mid = low+(high-low)/2;
             if(speed(piles,mid,h) <= h)
             {
                 high = mid -1;
             }
             else{
                low =mid+1;
             }
        }
        return low;
    }
    public int speed(int [] arr, int sp, int h)
    {
         int tot = 0 ;
         for(int i : arr)
         {
             tot+= (i + sp - 1) / sp;
             if(tot > h)
             {
                 return tot;
             }
         }
         return tot;
    }
}