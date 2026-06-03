class Solution {
    public int digitFrequencyScore(int n) {
        Map<Integer,Integer> map =  new HashMap<>();
        while(n > 0){
            int temp = n%10;
            map.put(temp,map.getOrDefault(temp,0)+1);
            n = n/10;
        }
        int ans = 0;
        for(int i : map.keySet()){
            ans+=(map.get(i) * i);
        }
        return ans;
    }
}