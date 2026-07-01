class Solution {
    public String processStr(String s) {
        StringBuilder ans =  new StringBuilder();
        for(char c : s.toCharArray()){
            switch(c){
                case '*' :
                         if(ans.length() != 0)
                         ans.deleteCharAt(ans.length() - 1);
                            continue;
                case '#' : String duplicate = ans.toString();
                            ans.append(duplicate);
                            continue;
                case '%' : 
                         if(ans.length() != 0)
                            ans.reverse();
                            continue;
                default: ans.append(c);            
            }
        }
        return ans.toString();
    }
}