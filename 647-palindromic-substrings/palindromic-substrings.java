class Solution {
    public int countSubstrings(String s) {
        int count = 0;
        for(int i=0;i<s.length();i++)
        {
            StringBuilder sb = new StringBuilder();
            for(int j=i;j<s.length();j++)
            {
                sb.append(s.charAt(j));
                if(is_plaindrome(sb.toString())){
                    count++;
                }
            }
        }
          return count;
    }
    public boolean is_plaindrome(String s)
    {
        int left = 0;
        int right = s.length()-1;
        while(left < right)
        {
             if(s.charAt(left)!=s.charAt(right))
             {
                return false;
             }
             left++;
             right--;
        }
        return true;
    }
}