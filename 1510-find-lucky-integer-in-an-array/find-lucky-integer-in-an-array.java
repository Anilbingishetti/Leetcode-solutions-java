class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i: arr)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int max = -1;
        for(int i : map.keySet())
        {
            if(i == map.get(i))
            {
                max = Math.max(i,max);
            }
        }
        return max;
    }
}