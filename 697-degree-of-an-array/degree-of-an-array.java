class Solution {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer,Integer> map1 = new HashMap<>();
        HashMap<Integer,Integer> first_occur = new HashMap<>();
        int deg =0 ;
        int best = nums.length;
        for(int i=0;i<nums.length;i++)
        {
            int x = nums[i];
            first_occur.putIfAbsent(x,i);
            int c = map1.getOrDefault(x,0)+1;
            map1.put(x,c);
            if(c > deg)
            {
                deg = c;
                best = i-first_occur.get(x)+1;
            }
            else if(c == deg)
            {
                best = Math.min(best,i-first_occur.get(x)+1);
            }
        }
        return best;
    }
}