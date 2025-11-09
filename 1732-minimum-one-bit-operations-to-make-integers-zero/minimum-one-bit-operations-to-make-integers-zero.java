class Solution {
    public int minimumOneBitOperations(int n) {
        int ans =0;
        for(int i=n;i!=0;i=i/2){
            ans^=i;
        }
        return ans;
    }
}