class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int ans = 0;
        int carry = capacity;
        for(int i=0;i<plants.length;i++)
        {
            if(plants[i] > carry)
            {
                ans+= 2*i;
                carry = capacity;
            }
            ans+=1;
            carry-=plants[i];
        }
        return ans;
    }
}