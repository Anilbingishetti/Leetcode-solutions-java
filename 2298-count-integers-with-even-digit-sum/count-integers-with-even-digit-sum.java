class Solution {
    public int countEven(int num) {
        int count = 0;
        for(int i=1;i<=num;i++)
        {
            if(is_even(i))
            {
                count++;
            }
        }
        return count;
    }
    public boolean is_even(int x)
    {
        int sum = 0;
        while(x > 0)
        {
            sum+=x%10;
            x/=10;
        }
        return sum%2==0;
    }
}