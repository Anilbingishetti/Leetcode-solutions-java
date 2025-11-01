class Solution {
    public boolean hasSameDigits(String s) {
        while(s.length() > 2)
        {
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<s.length()-1;i++)
            {
                 int x1 = s.charAt(i)-'0';
                 int x2 = s.charAt(i+1)-'0';;
                 sb.append((x1+x2)%10);
            }
            s = sb.toString();
        }
        return (s.length()==2 && s.charAt(0)== s.charAt(1));
    }
}