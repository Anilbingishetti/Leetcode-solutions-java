class Solution {
    public int minDeletions(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c : s.toCharArray())
        {
             map.put(c,map.getOrDefault(c,0)+1);
        }
        List<Integer> values = new ArrayList<>(map.values());
        int ans = 0;
        Collections.sort(values);
        Collections.reverse(values);
        for(int i=0;i<values.size();i++)
        {
            while (i < values.size()-1 && values.get(i+1) >= values.get(i) && values.get(i+1) > 0) {
                values.set(i+1, values.get(i+1) - 1);
                    ans++;
                }
        }
        return ans;
    }
}