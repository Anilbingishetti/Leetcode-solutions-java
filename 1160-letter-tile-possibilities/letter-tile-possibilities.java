class Solution {
    public int numTilePossibilities(String tiles) {
    HashSet<String> li = new HashSet<>();
    boolean [] used = new boolean[tiles.length()];
        dfs(tiles,new StringBuilder(),li,used);
        return li.size();
    }
    public void dfs(String s,StringBuilder sb,Set<String> li,boolean [] used)
    {
        for(int i=0;i<s.length();i++)
        {
            if(used[i])continue;
            used[i] = true;
            sb.append(s.charAt(i));
            li.add(sb.toString());
            dfs(s,sb,li,used);
            sb.deleteCharAt(sb.length()-1);
            used[i] = false;
        }
        
    }
}