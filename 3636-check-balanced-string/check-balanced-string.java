class Solution {
    public boolean isBalanced(String s) {
        int even = 0;
        int odd= 0;
        for(int i=0;i<s.length();i++)
        {
            if(i%2==0)
            {
                even += s.charAt(i)-'0';
            }
            else{
                odd += s.charAt(i)-'0';
            }
        }
        return even==odd;
    }
}