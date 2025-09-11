class Solution {
    public boolean isVowel(char c)
    {
        return c=='a' || c=='e'|| c=='i' || c=='o' ||c=='u' || c == 'A' || c=='E' ||c=='I'||c=='O' ||c=='U';
    }

    public String sortVowels(String s) {
        char [] ch = s.toCharArray();
        ArrayList<Character> li = new ArrayList<>();
        ArrayList<Integer> lis = new ArrayList<>();
        for(int i=0;i<s.length();i++)
        {
            char z = s.charAt(i);
            if(isVowel(z))
            {
                li.add(z);
                lis.add(i);
            }
        }
        Collections.sort(li);
        for(int i=0;i<li.size();i++)
        {
          ch[lis.get(i)] = li.get(i);
        } 
        return String.valueOf(ch);
    }
}