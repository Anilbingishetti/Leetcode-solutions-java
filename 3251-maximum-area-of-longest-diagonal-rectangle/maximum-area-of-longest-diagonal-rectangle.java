class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int max = Integer.MIN_VALUE;
        int max_a = 0;
        for(int i=0;i<dimensions.length;i++)
        {
             int l = dimensions[i][0];
             int w = dimensions[i][1];
             int dig = (l*l)+(w*w);
             if(dig > max)
             {
                 max = dig;
                 max_a = l*w;
             }
             else if(max == dig)
             {
                 max_a = Math.max(max_a,l*w);
             }
        }
        return max_a;
    }
}