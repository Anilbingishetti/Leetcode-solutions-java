class Solution {
    public String sortString(String s) {
        int [] freq = new int [26];
        for(char c : s.toCharArray())
        {
            freq[c-'a']++;
        }
        StringBuilder sb = new StringBuilder();
        while(sb.length() < s.length()){
            for(int i=0;i<26;i++)
            {
                if(freq[i] > 0)
                {
                    sb.append((char) ('a'+i));
                    freq[i]--;
                }
            }
            for(int j = 25;j>=0;j--)
            {
                if(freq[j] > 0)
                {
                    sb.append((char) ('a'+j));
                    freq[j]--;
                }
            }
        }
        return sb.toString();
    }
}