class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int x = numBottles;
        int sum = x;
        while(x >= numExchange)
        {
              x-=numExchange;
              sum++;
              x+=1;
              numExchange++;
        }
        return sum;
    }
}