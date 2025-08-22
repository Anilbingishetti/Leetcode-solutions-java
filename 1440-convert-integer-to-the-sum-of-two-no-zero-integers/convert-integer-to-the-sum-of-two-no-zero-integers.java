class Solution {
    public int[] getNoZeroIntegers(int n) {
        for(int i=1;i<=n;i++)
        {
            int tar = n - i;
            if(!not_contains(tar) && !not_contains(i)){
            if(tar + i ==n && tar!=0 && i!=0)
            {
                return new int []{i,tar};
            }
            }
        }
        return new int[]{-1,-1};
    }
    public boolean not_contains(int x){
        String s = Integer.toString(x);
        return s.contains("0");
    }
}