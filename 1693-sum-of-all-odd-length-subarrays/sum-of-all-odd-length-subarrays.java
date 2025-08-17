class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int pre [] = new int [arr.length];
        pre[0] = arr[0];
        for(int i=1;i<arr.length;i++)
        {
          pre[i] = arr[i]+pre[i-1];
        }
        int sum = 0;
        for(int i=0;i<arr.length;i++)
        {   
            sum+=arr[i];
            for(int j=i+1;j<arr.length;j++)
            {
                 if(Math.abs(i-j)%2==0)
                 {
                    int l = (i > 0) ? pre[i-1] : 0;
                    sum+=pre[j]-l;
                 }
            }
        }
        return sum;
    }
}