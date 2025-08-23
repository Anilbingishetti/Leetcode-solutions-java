class Solution {
    public int minOperations(String s) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            if(i%2==0)
            {
                sb1.append('0');
            }
            else{
                sb1.append('1');
            }
        }
        for(int i=0;i<s.length();i++){
            if(i%2==0)
            {
                sb2.append('1');
            }
            else{
                sb2.append('0');
            }
        }
        int count1 =0;
        int count2 = 0;
        String k = sb1.toString();
        String l = sb2.toString();
        for(int i =0;i<s.length();i++)
        {
             if(s.charAt(i)!=k.charAt(i))
             {
                count1++;
             }
             if(s.charAt(i)!=l.charAt(i)){
                count2++;
             }
        }
        return Math.min(count1,count2);
    }
}