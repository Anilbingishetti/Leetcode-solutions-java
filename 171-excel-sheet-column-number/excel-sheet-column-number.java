class Solution {
    public int titleToNumber(String col) {
         int ans = 0;
         for(int i=0;i < col.length();i++)
         {
            int num = col.charAt(i)-'A'+ 1;
            ans = ans * 26 + num ;
         }
         return ans;
    }
}