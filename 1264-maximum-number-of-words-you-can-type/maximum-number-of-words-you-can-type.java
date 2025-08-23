class Solution {
    public int canBeTypedWords(String t, String br) {
        int count = 0;
        String [] str = t.split(" ");
        for(String s : str){
            int c = 0;
            for(char ch : br.toCharArray())
            {
                if(s.contains(String.valueOf(ch)))
                {
                    c++;
                }
            }
            if(c == 0)
            {
                count++;
            }
        }
        return count;
    }
}