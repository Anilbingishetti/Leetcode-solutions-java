class Solution {
    public int countAsterisks(String s) {
        boolean li = true;
        int count = 0;
        for(char c : s.toCharArray())
        {
            if(c=='|')
            {
                li = !li;
            }
            else if(c=='*' && li)
            {
                count++;
            }
        }
        return count;
    }
}