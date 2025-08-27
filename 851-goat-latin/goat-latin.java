class Solution {
    public String toGoatLatin(String sentence) {
        String [] str = sentence.split(" ");
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<str.length;i++)
        {
            StringBuilder sb = new StringBuilder();
            String k = str[i];
            if(is_vowel(k.charAt(0)))
            {
                 sb.append(k + "ma" + "a".repeat(i+1));
            }
            else{
                 sb.append(k.substring(1));
                 sb.append(k.charAt(0));
                 sb.append("ma" + "a".repeat(i+1));
            }
            ans.append(sb.toString()+" ");
        }
        return ans.toString().trim();
    }
    public boolean is_vowel(char c)
    {
        return (c=='a' || c=='e'||c=='i'||c=='o'||c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U');
    }
}