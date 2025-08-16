class Solution {
    public int maximum69Number (int num) {
        String s = Integer.toString(num);
        char [] ch = s.toCharArray();
        int max = Integer.MIN_VALUE;
        for(int i =0;i<ch.length;i++)
        {
            if(ch[i] == '6')
            {
                ch[i] ='9';
                max = Math.max(max,Integer.parseInt(String.valueOf(ch)));
                ch[i] ='6';
            }
        }
        max = Math.max(max,num);
        return max;
    }
}