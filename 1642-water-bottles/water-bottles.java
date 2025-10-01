class Solution {
    public int numWaterBottles(int bottle, int exchange) {
        int x = bottle;
        int sum = x;
        while(x >= exchange)
        {
             int ex = x/exchange;
             int rem = x%exchange;
             sum+=ex;
             x=ex+rem;
        }
        return sum;
    }
}