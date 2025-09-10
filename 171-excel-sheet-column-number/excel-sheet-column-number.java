class Solution {
    public int titleToNumber(String col) {
        int n = col.length();
         int ans = 0;
         for(int i=0;i < n;i++)
         {
            int num = col.charAt(i)-'A'+ 1;
            ans = ans * 26 + num ;
         }
         return ans;
    }
}