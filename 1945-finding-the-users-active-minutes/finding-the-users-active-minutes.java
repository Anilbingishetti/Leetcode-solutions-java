class Solution {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        int [] ans = new int [k];
        HashMap<Integer,Set<Integer>> map = new HashMap<>();
               for(int[] log:logs){
            map.computeIfAbsent(log[0], x -> new HashSet<>()).add(log[1]);
        }
        for(Set<Integer> time:map.values()){
            int i=time.size();
            if(i<=k){
                ans[i-1]++;
            }
        }
        return ans;
    }
}