class Solution {
    public boolean isPowerOfTwo(int n) {
       if(n==1 || n==2)
       {
        return true;
       }
       for(int i=0;i<=Math.ceil(Math.sqrt(n));i++)
       {
            if(n == Math.pow(2,i)){
                return true;
            }
       }
       return false;
    }
}