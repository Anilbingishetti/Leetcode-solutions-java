class Solution {
    public int[] evenOddBit(int n) {
        StringBuilder sb = new StringBuilder(); 
        sb.append(Integer.toBinaryString(n));
        String k = sb.reverse().toString();
        int even = 0;
        int odd = 0;
        for(int i=0;i<k.length();i++)
        {
            if(k.charAt(i) == '1'){
                if(i%2 == 0){
                    even++;
                }
                else{
                    odd++;
                }
            }
        }
        int [] arr = new int [2];
        arr[0] = even;
        arr[1] = odd;
        return arr;
    }
}