class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int count = 0;
        int f =0;
        int s = 0;
        for(int i=0;i < s1.length();i++)
        {
            if(s1.charAt(i)!=s2.charAt(i)){
                count++;

                if(count > 2)
                {
                    return false;
                }
                else if(count == 1)
                {
                     f = i;
                }
                else{
                    s=i;
                }
            }
        }
        return (s1.charAt(f) == s2.charAt(s) && s1.charAt(s) == s2.charAt(f));
    }
}