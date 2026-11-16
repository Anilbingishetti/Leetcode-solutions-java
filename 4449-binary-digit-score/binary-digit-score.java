class Solution {
    public int calculateScore(int a, int b) {
        int x = Integer.toBinaryString(a).replace("0","").length();
        int y = Integer.toBinaryString(b).replace("0","").length();
        if(x >= y){
            return x*y;
        }
        return y/x;
    }
}