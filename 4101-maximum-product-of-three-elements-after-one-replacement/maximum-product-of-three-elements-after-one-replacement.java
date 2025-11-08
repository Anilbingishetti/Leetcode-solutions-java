class Solution {
    public long maxProduct(int[] nums) {
        long ans = 100000;
        long max1= 0;
        long max2= 0;
        for(int i : nums)
        {
            long ele = Math.abs(i);
             if(ele >= max1)
             {
                 max2 = max1;
                 max1 = ele;
             }
            else if(ele > max2)
             {
                max2=ele;
             }
             
        }
        return ans*max2*max1;  
    }
}