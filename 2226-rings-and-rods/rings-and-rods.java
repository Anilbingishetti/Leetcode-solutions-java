class Solution {
    public int countPoints(String rings) {
        HashMap<Integer,Set<Character>> map = new HashMap<>();
        for(int i=1;i<rings.length();i=i+2)
        {
            char c = rings.charAt(i-1);
            if(map.containsKey((rings.charAt(i))-'0'))
            {
                map.get(rings.charAt(i)-'0').add(c);
            }
            else{
                map.put((rings.charAt(i)-'0'),new HashSet<>());
                map.get(rings.charAt(i)-'0').add(c);
            }
        }
        int count = 0;
        for(Set<Character> s : map.values())
        {
            if(s.size() == 3){
                count++;
            }
        }
        return count;
    }
}