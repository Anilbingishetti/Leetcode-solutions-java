class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map = new HashMap<>();
        List<Character> assigned = new ArrayList<>();
        for(int i=0;i<s.length();i++)
        {
            if(!map.containsKey(s.charAt(i))&& !assigned.contains(t.charAt(i))){
                assigned.add(t.charAt(i));
                map.put(s.charAt(i),t.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray())
        {
           sb.append(map.get(c));
        }
        return sb.toString().equals(t);
    }
}