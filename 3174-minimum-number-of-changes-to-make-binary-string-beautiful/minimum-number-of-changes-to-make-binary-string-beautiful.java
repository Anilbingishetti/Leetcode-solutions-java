class Solution {
    public int minChanges(String s) {
        char [] ch = s.toCharArray();
        int ans =0;
        for(int i=0;i<ch.length;i=i+2){
            if(ch[i]!=ch[i+1])
            {
                ans++;
            }
        }
        return ans;
    }
}