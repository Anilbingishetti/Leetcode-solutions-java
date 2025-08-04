class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int count  = 0;
        boolean [] is_place = new boolean [baskets.length];
        for(int i=0;i<fruits.length;i++)
        {
            for(int j=0;j<baskets.length;j++)
            {
                if(baskets[j] >= fruits[i] && is_place[j] == false)
                {
                    count++;
                    is_place[j] = true;
                    break;
                }
            }
        }
        return fruits.length - count;
    }
}