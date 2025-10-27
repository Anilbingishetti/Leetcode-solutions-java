class Solution {
    public int numberOfBeams(String[] bank) {
        int prev=0;
        int ans=0;
        for(String s : bank)
        {
            int count  =0;
            for(char c : s.toCharArray())
            {
                if(c=='1')count++;
            }
            if(count > 0){
            ans+=(prev*count);
            prev = count;
            }
        }
        return ans;
    }
}