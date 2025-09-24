class Solution {
    public boolean reportSpam(String[] message, String[] bannedWords) {
        int count = 0;
        Set<String> li = new HashSet<>();
        for(String s : bannedWords)
        {
             li.add(s);
        }
        for(String s : message)
        {
             if(li.contains(s) && count < 2)
             {
                 count++;
             }
             if(count >= 2)
             {
                 return true;
             }
        }
        return false;
    }
}