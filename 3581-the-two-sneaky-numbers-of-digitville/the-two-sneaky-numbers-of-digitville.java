class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int [] ans = new int [2];
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for(int i : nums)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int j =0;
        for(int i : map.keySet())
        {
            if(map.get(i) >=2){
                ans[j++] = i;
            }
        }
        return ans;
    }
}