class Solution {
    public int[] sortByBits(int[] arr) {
        TreeMap<Integer,ArrayList<Integer>> map = new TreeMap<>();
        for(int i : arr)
        {
            int count = Integer.bitCount(i);
            if(map.containsKey(count)){
            map.get(count).add(i);
            }else{
            map.put(count,new ArrayList<>());
            map.get(count).add(i);
            }
            
        }
        int j = 0;
        for(int i : map.keySet())
        {
            ArrayList<Integer> li = map.get(i);
            Collections.sort(li);
            for(int k : li)
            {
                arr[j++] = k;
             }
        }
        return arr;
    }
}