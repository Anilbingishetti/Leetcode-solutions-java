class Solution {
    public boolean isSubstringPresent(String s) {
        String reverse = new StringBuilder(s).reverse().toString();
        Set<String> substrings = new HashSet<>();
        for(int i=0;i<=s.length()-2;i++)
        {
            String s1 = s.substring(i,i+2);
            substrings.add(s1);
        }
        for(String k : substrings){
            if(reverse.contains(k))return true;
        }
        return false;
    }
}