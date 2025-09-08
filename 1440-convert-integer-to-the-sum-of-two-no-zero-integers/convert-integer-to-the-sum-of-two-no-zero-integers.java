class Solution {
    public int[] getNoZeroIntegers(int n) {
         if(n==2)
         {
             return new int[]{1,1};
         }
         for(int i=1;i<n;i++)
         {
            int tar = n-i;
            if(!Integer.toString(tar).contains("0") && !Integer.toString(i).contains("0"))
            {
                return new int[]{i,tar};
            }
         }
         return new int []{-1,-1};
    }
}