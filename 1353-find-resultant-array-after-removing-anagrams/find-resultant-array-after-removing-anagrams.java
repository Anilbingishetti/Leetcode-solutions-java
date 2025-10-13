class Solution {
    public List<String> removeAnagrams(String[] words) {
        Stack<String> stk = new Stack<>();
        Stack<Integer> ind_stk = new Stack<>();
        int ind = 0;
        for(String s : words)
        {
            char [] ch = s.toCharArray();
            Arrays.sort(ch);
            String k = String.valueOf(ch);
            if(!stk.isEmpty())
            {
                 if(stk.peek().equals(k))
                 {
                    ind++;
                    continue;
                 }
                 else{
                    stk.push(k);
                    ind_stk.push(ind);
                    ind++;
                 }
            }
            else{
                stk.push(k);
                ind_stk.push(ind);
                ind++;
            }
        }
        List<String> li = new ArrayList<>();
        for(int i : ind_stk)
        {
            li.add(words[i]);
        }
        return li;
    }
}