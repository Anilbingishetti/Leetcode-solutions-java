class Solution {
    public int findTheLongestBalancedSubstring(String s) {
        int max = 0;
        for(int i=0;i<s.length();i++)
        {
            for(int j=i;j<s.length();j++)
            {
                String sub = s.substring(i,j+1);
                if(sub.startsWith("0") && is_valid(sub))
                {
                    max = Math.max(max,j-i+1);
                }
            }
        }
        return max;
    }
    public boolean is_valid(String s)
    {
        int len = s.length();
        if(len%2!=0)
        {
             return false;
        }
        int mid = len/2;
        for(int i=0;i<mid;i++)
        {
            if(s.charAt(i)!='0'){return false;}
            if(s.charAt(mid+i)!='1'){return false;}
        }
        return true;
    }
}