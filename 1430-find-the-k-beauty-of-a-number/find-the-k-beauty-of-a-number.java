class Solution {
    public int divisorSubstrings(int num, int k) {
        StringBuilder sb = new StringBuilder();
        String n = Integer.toString(num);
        sb.append(n.substring(0,k));
        int count = 0;
        for(int i=0;i<=n.length()-k;i++)
        {
            int val = Integer.parseInt(sb.toString());
             if(val!=0 && num%val == 0)
             {
                 count++;
             }
             if(i+k < n.length()){
             sb.deleteCharAt(0);
             sb.append(n.charAt(i+k));
             }
        }
        return count;
    }
}