class Solution {
    public boolean checkPrimeFrequency(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : nums)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i : map.values())
        {
            if(is_prime(i))
            {
                return true;
            }
        }
        return false;
    }
    public boolean is_prime(int n)
    {
        if(n<2)
        {
            return false;
        }
        if(n==2)
        {
            return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
}