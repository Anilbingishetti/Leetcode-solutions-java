class Solution {
    public int countCommas(int n) {
        if(n < 1000){
            return 0;
        }
        if(n > 999 && n < 100000)
        {
            return (n-1000)+1;
        }
        return (n-1000)+1;    
    }
}