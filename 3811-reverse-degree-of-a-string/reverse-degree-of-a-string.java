class Solution {
    public int reverseDegree(String s) {
        int sum = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        char c = 'a';
        for(int i =0;i<26;i++)
        {
            map.put(c,i);
            c++;
        }
        for(int i=0;i<s.length();i++){
            int ind2 = 26 - map.get(s.charAt(i));
            sum+=((i+1)*ind2);
        }
        return sum;
    }
}