class Solution {
    public int getLeastFrequentDigit(int n) {
        HashMap<Integer,Integer> li = new HashMap<>();
        while(n > 0)
        {
            int val = n%10;
             li.put(val,li.getOrDefault(val,0)+1);
             n=n/10;
        }
        int min_freq = Integer.MAX_VALUE;
        int val = Integer.MAX_VALUE;
        for(int i : li.keySet())
        {
            int freq = li.get(i);
            if(freq < min_freq)
            {
                 min_freq = freq;
                 val = i;
            }
            else if(freq == min_freq && i < val)
            {
                 val = i;
            }
        }
        return val;
    }
}