class Solution {
    public int reverseBits(int n) {
        String s = Integer.toBinaryString(n);
        if(s.length() < 32)
        {
             StringBuilder k = new StringBuilder();
             for(int i=0;i<32-s.length();i++)
             {
                k.append(0);
             }
             s =k.toString()+s;
        }
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        return Integer.parseInt(sb.toString(),2);
    }
}