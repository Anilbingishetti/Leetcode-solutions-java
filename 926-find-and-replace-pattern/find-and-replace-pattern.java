class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> ans = new ArrayList<>();
        for(String s : words)
        {
             if(isEqual(s,pattern))
             {
                ans.add(s);
             }
        }
        return ans;
    }
    public boolean isEqual(String s1 , String s2)
    { 
        HashMap<Character,Character> map = new HashMap<>();
        List<Character> assigned = new ArrayList<>();
        for(int i=0;i<s1.length();i++)
        {
            if(!map.containsKey(s1.charAt(i))&& !assigned.contains(s2.charAt(i)))
            {
                map.put(s1.charAt(i),s2.charAt(i));
                assigned.add(s2.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char c : s1.toCharArray())
        {
            sb.append(map.get(c));
        }
        return sb.toString().equals(s2);
    }
}