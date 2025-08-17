class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int p = 0;
        int g = 0;
        int m = 0;
        int ps=0;int gs=0;int ms=0;
        int prefix [] = new int [travel.length];
        prefix[0] = travel[0];
        for(int i=1;i<travel.length;i++)
        {
            prefix[i] = prefix[i-1]+travel[i];
        }
        for(int i=0;i<garbage.length;i++)
        {
            String s = garbage[i];
            for(char c : s.toCharArray())
            {
                if(c == 'G')
                {
                    g++;
                    gs = i;
                }
                else if(c == 'P')
                {
                    p++;
                    ps = i;
                }
                else{
                    m++;
                    ms = i;
                }
            }
        }
        int tot = 0;
        if(gs > 0)
        {
            tot+=prefix[gs-1];
        }
        if(ms > 0)
        {
            tot+=prefix[ms-1];
        }
        if(ps > 0)
        {
            tot+=prefix[ps-1];
        }
        return tot+g+p+m;
    }
}