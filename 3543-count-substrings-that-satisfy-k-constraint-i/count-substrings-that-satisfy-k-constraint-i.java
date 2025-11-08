class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        int count = 0;
        for(int i=0;i<s.length();i++)
        {
            StringBuilder sb = new StringBuilder();
            for(int j=i;j<s.length();j++)
            {
                 sb.append(s.charAt(j));
                 if(check(sb.toString(),k))
                 {
                      count++;
                 }
            }
        }
        return count;
    }
    public boolean check(String s,int k){
        int one = 0;
        int zero = 0;
        for(char c : s.toCharArray()){
            if(c == '1'){one++;}
            else{zero++;}
        }
        return (one <= k) || (zero <= k);
    }
}