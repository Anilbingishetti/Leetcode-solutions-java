class Solution {
    public int minTimeToType(String word) {
        String clock = "abcdefghijklmnopqrstuvwxyzabcdefghijlkmnopqrstuvwxyz";
        char pc = 'a';
        int pid1 = 0;
        int pid2 = -1;
        int cid1 = -1;
        int cid2 = -1;
        int ans = 0;
        String s = "a"+word;
        for(int i=1;i<s.length();i++)
        {
             cid1 = find_id(s.charAt(i),clock);
             cid2 = cid1+26;
             pid2 = pid1+26;
             ans += Math.min(Math.min(Math.abs(pid1-cid1),Math.abs(pid1-cid2)),Math.min(Math.abs(pid2-cid1),Math.abs(pid2-cid2)))+1;
             pid1 = cid1;
        }
        return ans;
    }
    public int find_id(char c , String s)
    {
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) == c)
            {
                return i;
            }
        }
        return -1;
    }
}