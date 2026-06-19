class Solution {
    public boolean checkGoodInteger(int n) {
        int totSum = 0;
        int sqSum = 0;
        while(n > 0){
            int temp = n%10;
            totSum += temp;
            sqSum += (temp*temp);
            n/=10;
        }
        return sqSum - totSum >=50;
    }
}