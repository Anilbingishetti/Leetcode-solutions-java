class Solution {
    public boolean isPalindrome(int x) {
        if( x < 0)
        {
            return false;
        }
        int t = x;
        int num = 0;
        while(x > 0)
        {
            num = num*10 + x%10;
            x = x/10;
        }
        return t == num;
    }
}