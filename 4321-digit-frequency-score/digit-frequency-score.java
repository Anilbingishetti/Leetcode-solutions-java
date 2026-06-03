class Solution {
    public int digitFrequencyScore(int n) {
        int ans = 0;
        while(n > 0){
            int temp = n%10;
            ans+=temp;
            n = n/10;
        }
        return ans;
    }
}