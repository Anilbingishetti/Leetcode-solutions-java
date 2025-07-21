class Solution {
    public String makeFancyString(String s) {
        StringBuilder sb = new StringBuilder();
        int count =1;
        sb.append(s.charAt(0));
        for(int i=1;i<s.length();i++)
        {
             if(s.charAt(i) == sb.charAt(sb.length() - 1))
             {
                count++;
                if(count < 3)
                 {  
                    sb.append(s.charAt(i));                
                 }
             }
             else{
                sb.append(s.charAt(i));
                count = 1;
             }
             
        }
        return sb.toString();
    }
}