class Solution {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        int [] ans = new int [k];
        HashMap<Integer,Set<Integer>> map = new HashMap<>();
        for(int i=0;i<logs.length;i++)
        {
            int id = logs[i][0];
            int ti = logs[i][1];
            if(!map.containsKey(id)){
            map.put(id,new  HashSet<Integer> ());
            map.get(id).add(ti);
            }
            else{
                map.get(id).add(ti);
            }
        }
        for(int i : map.keySet()){
            Set<Integer> set = map.get(i);
            int s = set.size();
            ans[s-1]++;
        }
        return ans;
    }
}