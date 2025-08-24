class Solution {
    public String thousandSeparator(int n) {
        StringBuilder sb = new StringBuilder();
        String s = Integer.toString(n);
        if(s.length() <= 3)
        {
            return s;
        }
        int count =0;
        for(int i=s.length()-1;i>=0;i--)
        {
             sb.append(s.charAt(i));
             count++;
             if(count%3==0 && i!=0)
             {
                sb.append('.');
             }
        }
        return sb.reverse().toString();
    }
}