class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : nums)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        List<Integer> li = new ArrayList<>(map.values());
        Collections.sort(li);
        int sum =0;
        int max = li.get(li.size()-1);
        for(int i=0;i<li.size();i++)
        {
            if(li.get(i) == max)
            {
                sum+=li.get(i);
            }
        }  
        if(sum == 0)
        {
            return nums.length;
        }  
        return sum;
     }
}