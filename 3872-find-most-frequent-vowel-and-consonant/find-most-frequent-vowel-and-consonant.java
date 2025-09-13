class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        for(char c : s.toCharArray())
            {
                if(is_vowel(c))
                {
                    map1.put(c,map1.getOrDefault(c,0)+1);
                }
                else{
                    map2.put(c,map2.getOrDefault(c,0)+1);
                }
            }
           int m1 = 0;
           int  m2 = 0;
           for(char c : map1.keySet())
               {
                   m1 = Math.max(map1.get(c),m1);
               }
         for(char c : map2.keySet())
               {
                   m2 = Math.max(map2.get(c),m2);
               }
        return m1+m2;
    }
    public static boolean is_vowel(char c) {
        return "aeiou".indexOf(c) != -1;
    }
}