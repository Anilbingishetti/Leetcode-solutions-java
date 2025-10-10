class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int ans = 0;
        int carry = capacity;
        boolean went_back = false;
        for(int i=0;i<plants.length;i++)
        {
            if(plants[i] > carry)
            {
                ans+=i;
                went_back = true;
                carry = capacity;
            }
            if(went_back){
                ans+=i;
                went_back = false;
            }
            ans+=1;
            carry-=plants[i];
        }
        return ans;
    }
}