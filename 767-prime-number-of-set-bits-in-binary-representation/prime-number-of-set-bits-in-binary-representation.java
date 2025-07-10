class Solution {
    public int countPrimeSetBits(int left, int right) {
        int count = 0;
        for(int i=left;i<=right;i++){
        int bit = Integer.bitCount(i);
          if(is_Prime(bit))
          {
            count++;
          }
        }
        return count;
    }
    public boolean is_Prime(int n)
    {
        if(n<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++)
        {
             if(n%i==0)
             {
                return false;
             }
        }
        return true;
    }
}