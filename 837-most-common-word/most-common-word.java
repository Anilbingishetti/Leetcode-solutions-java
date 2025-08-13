class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph = paragraph.toLowerCase();
        String s1 = clean_string(paragraph);
        String [] str = s1.split(" ");
        List<String> ban = new ArrayList<>();
        for(String s : banned)
        {
            ban.add(s);
        }
        HashMap<String,Integer> map = new HashMap<>();
        for(String s : str)
        {
            if(ban.contains(s) || s.equals(""))
            {
                continue;
            }
            map.put(s,map.getOrDefault(s,0)+1);
        }
        String ans ="";
        int max = 0;
        for(String s : map.keySet())
        {
            if(map.get(s) > max)
            {
                max = map.get(s);
                ans = s;
            }
        }
        return ans;
    }
    public String clean_string(String s)
    {
        StringBuffer sb = new StringBuffer();
        for(char c : s.toCharArray())
        {
            if(c== '!' || c== '?' || c== 39 || c==',' ||c== ';' || c == '.')
            {
                sb.append(" ");
                continue;
            }
            else{
                sb.append(c);
            }
        }
        return sb.toString().trim();
    }
}