class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for(int [] i : items1)
        {
             if(map.containsKey(i[0]))
             {
                   map.put(i[0],map.get(i[0])+i[1]);
             }
             else{
                map.put(i[0],i[1]);
             }
        }
        for(int [] i : items2)
        {
             if(map.containsKey(i[0]))
             {
                   map.put(i[0],map.get(i[0])+i[1]);
             }
             else{
                map.put(i[0],i[1]);
             }
        }
        List<List<Integer>> ans = new ArrayList<>();
        for(int i : map.keySet()){
            List<Integer> li = Arrays.asList(i,map.get(i));
            ans.add(li);
        }
        return ans;
    }
}