class Solution {
    public int bitwiseComplement(int n) {
        StringBuilder sb = new StringBuilder();
        for(char c : Integer.toBinaryString(n).toCharArray()){
            if(c=='1')sb.append('0');
            else sb.append('1');
        }
        return Integer.parseInt(sb.toString(),2);
    }
}