class Solution {
    public boolean sumOfNumberAndReverse(int num) {
        if(num == 0)return true;
        for(int i=1;i<num;i++)
        {
             if(i + reverse(i) == num)
             return true;
        }
        return false;
    }
    public int reverse(int x)
    {
         int y = 0;
         while(x > 0)
         {
             y = y*10+x%10;
             x = x/10;
         }
         return y;
    }
}