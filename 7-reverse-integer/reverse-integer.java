class Solution {
    public int reverse(int x) {
        int num = 0;
        boolean is = false;
        if(x<0)
        {
            is = true;
            x = x*-1;
        }
        while(x > 0)
        {
            int temp = x%10;
            if(num > Integer.MAX_VALUE/10)
            {
                 return 0;
            } 
            num = num*10+temp;
            x = x/10;
        }
        if(is)
        {
             return num*-1;
        }
        return num;
    }
}