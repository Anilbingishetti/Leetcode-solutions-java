class Solution {
    public int maxDifference(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int even = Integer.MAX_VALUE;
        int odd = Integer.MIN_VALUE;
        for(char ch : map.keySet()){
            if(map.get(ch)%2 == 0 && map.get(ch) > 0){
                even = Math.min(even,map.get(ch));
            }
            else{
                odd = Math.max(odd,map.get(ch));
            }
        }
       if (odd == Integer.MIN_VALUE || even == Integer.MAX_VALUE) {
            return 0; 
        }
        return odd - even;
    }
}